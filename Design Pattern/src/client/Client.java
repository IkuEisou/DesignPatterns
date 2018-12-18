/**
 *
 */
package client;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import pattern.Singleton;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Future<Singleton> f1 = executor.submit(Singleton::getInstance);
		Future<Singleton> f2 = executor.submit(Singleton::getInstance);

		Singleton s1;
		try {
			s1 = f1.get();

		Singleton s2 = f2.get();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		} catch (InterruptedException | ExecutionException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
