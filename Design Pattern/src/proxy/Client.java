/**
 *
 */
package proxy;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ISubject robot = new Proxy(new RealSubject());
		robot.request1();
		robot.request2();
		robot.request3();
	}

}
