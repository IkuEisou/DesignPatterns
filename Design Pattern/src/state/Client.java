/**
 *
 */
package state;

import java.util.Random;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Context context = new Context();
		int temp = 0;
		int condition = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("--------------------");
			temp = rand.nextInt(10);
			System.out.println(i + "回目：" + temp);
			condition = temp % 2;
			System.out.println("　　 ：" + condition);
			// A->B
			context.contextMethod1(condition);
			// B->A
			context.contextMethod2();
			System.out.println();
		}

	}

}
