/**
 *
 */
package singleton;

/**
 * @author yuyc
 *
 */
public class Singleton_Synchronized {
	private static Singleton_Synchronized singleton = null;

	private Singleton_Synchronized() {
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static synchronized Singleton_Synchronized getInstance() {
		if (singleton == null) {
			singleton = new Singleton_Synchronized();
		}
		return singleton;
	}
}
