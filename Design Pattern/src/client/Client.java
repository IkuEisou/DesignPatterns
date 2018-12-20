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
		do {
			System.out.println("Choose the method:");
			String[] methodArr = { "1: Singleton_Holder", "2: Singleton_VDCL", "3: Singleton_Classic",
					"4: Singleton_Synchronized", "5: Singleton_static_final", "6: Singleton_Double_Check_Lock",
//					"7: Singleton_Enum",
					"-1: exit" };

			for (String method : methodArr) {
				System.out.println(method);
			}

			num = scanner.nextInt();
			execute(num);

		} while (num != -1);
		scanner.close();
	}

	private static void execute(int num) {
		Callable<Object> task = null;
//		Singleton_Enum singleton = null;

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
//			singleton = Singleton_Enum.SINGLETON;
			break;
		default:
			break;
		}

		if (null == task) {
			return;
		}

		long start = System.currentTimeMillis();
		_execute(task);
//		_execute_SetByThreadNum(task);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	private static void _execute(Callable<Object> task) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Object> f1 = executor.submit(task);
		Future<Object> f2 = executor.submit(task);
		Object s1 = null, s2 = null;

		try {
			s1 = f1.get();
			s2 = f2.get();

			System.out.println(s1);
			System.out.println(s2);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		System.out.print("Is Singleton:");
		System.out.println(s1 == s2);
	}

	private static void _execute_SetByThreadNum(Callable<Object> task) {
		System.out.println("Input the number of thread:");
		Scanner scanner = new Scanner(System.in);
		int tnum = scanner.nextInt();
		ExecutorService executor = Executors.newFixedThreadPool(tnum);
		ArrayList<Object> insList = new ArrayList<Object>();

		for (int i = 0; i < tnum; i++) {
			Future<Object> f = executor.submit(task);
			try {
				Object s = f.get();
				System.out.println(s);
				insList.add(s);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}finally {
				scanner.close();
			}
		}

		System.out.print("Is Singleton:");
		boolean IsSingleton = insList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.get(insList.get(0)) == tnum;
		System.out.println(IsSingleton);
	}
}
