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
import singleton.Singleton_Holder;
import singleton.Singleton_VDCL;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Choose the method:");
		String[] methodArr = { "1: Singleton_Holder", "2: Singleton_VDCL", "3: Classic" };

		for (String method : methodArr) {
			System.out.println(method);
		}

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Callable<Object> task = null;

		switch (num) {
		case 1:
			task = Singleton_Holder::getInstance;
			break;
		case 2:
			task = Singleton_VDCL::getInstance;
			break;
		case 3:
			task = Singleton_Classic::getInstance;
		default:
			break;
		}

		if (null == task) {
			return;
		}

		System.out.println("Input the number of thread:");
		int tnum = scanner.nextInt();

		ExecutorService executor = Executors.newFixedThreadPool(tnum);
		ArrayList<Object> insList = new ArrayList<Object>();
		for (int i = 0; i < tnum; i++) {
			Future<Object> f = executor.submit(task);
			Object s;
			try {
				s = f.get();
				System.out.println(s);
				insList.add(s);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		System.out.print("Is Singleton:");
		boolean IsSingleton = insList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.get(insList.get(0)) == tnum;
		System.out.println(IsSingleton);
	}

}
