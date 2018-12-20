/**
 *
 */
package singleton;

/**
 * @author yuyc
 *
 */
public class Singleton_Classic {
	private static Singleton_Classic singleton = null;

	private Singleton_Classic(){
		try{
			Thread.sleep(2 * 1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Singleton_Classic is created!");
		}
	}

	public static Singleton_Classic getInstance(){
		if (null == singleton) {
			singleton = new Singleton_Classic();
		}
		return singleton;
	}
}
