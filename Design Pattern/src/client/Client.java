/**
 *
 */
package client;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import singleton.Singleton_Classic;
import singleton.Singleton_Double_Check_Lock;
import singleton.Singleton_Holder;
import singleton.Singleton_Synchronized;
import singleton.Singleton_VDCL;
import singleton.Singleton_static_final;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = -1;
		Scanner scanner = new Scanner(System.in);
		try {
			do {
				System.out.println("\nChoose the method:");
				String[] methodArr = { "1: Singleton_Holder", "2: Singleton_VDCL", "3: Singleton_Classic",
						"4: Singleton_Synchronized", "5: Singleton_static_final", "6: Singleton_Double_Check_Lock",
						// "7: Singleton_Enum",
						"-1: exit\r\n" };

				for (String method : methodArr) {
					System.out.println(method);
				}

				num = scanner.nextInt();
				if (-1 != num) {
					System.out.println("\nInput the number of thread:\r\n");
					int tnum = scanner.nextInt();

					execute(num, tnum);

				}
			} while (num != -1);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static void execute(int num, int tnum) throws InterruptedException, ExecutionException {
		Callable<Object> task = null;
		// Singleton_Enum singleton = null;

		switch (num) {
		case 1:
			task = Singleton_Holder::getInstance;
			break;
		case 2:
			task = Singleton_VDCL::getInstance;
			break;
		case 3:
			task = Singleton_Classic::getInstance;
			break;
		case 4:
			task = Singleton_Synchronized::getInstance;
			break;
		case 5:
			task = Singleton_static_final::getInstance;
			break;
		case 6:
			task = Singleton_Double_Check_Lock::getInstance;
			break;
		case 7:
			// singleton = Singleton_Enum.SINGLETON;
			break;
		default:
			break;
		}

		if (null == task) {
			return;
		}

		long start = System.currentTimeMillis();
		_execute(task, tnum);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	private static void _execute(Callable<Object> task, int tnum) {
		ArrayList<Future<Object>> insList = new ArrayList<Future<Object>>();
		ArrayList<Object> insNameList = new ArrayList<Object>();
		ExecutorService executor = Executors.newFixedThreadPool(tnum);
		try {
			for (int i = 0; i < tnum; i++) {
				Future<Object> f = executor.submit(task);
				insList.add(f);
			}

			for (Future<Object> f : insList) {
				Object s;

				s = ((Future<Object>) f).get();

				insNameList.add(s);
				System.out.println(s);
			}

			System.out.print("Is Singleton:");
			boolean IsSingleton = insNameList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
					.get(insNameList.get(0)) == tnum;
			System.out.println(IsSingleton);
			insNameList.clear();
			insList.clear();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
			try {
				executor.awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
				executor.shutdownNow();
			}
		}
	}
}
