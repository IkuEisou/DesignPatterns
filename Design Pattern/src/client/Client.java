/**
 *
 */
package client;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
		System.out.println("Chose the method:");
		String[] methodArr = {"1: Singleton_Holder","2: Singleton_VDCL"};

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
//			break;
		default:
			break;
		}

		if (null == task) {
			return;
		}

		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Object> f1 = executor.submit(task);
		Future<Object> f2 = executor.submit(task);

		Object s1;
		try {
			s1 = f1.get();

			Object s2 = f2.get();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
