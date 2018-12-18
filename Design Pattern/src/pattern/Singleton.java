/**
 *
 */
package pattern;
/**
 * @author yuyc
 *
 */
public final class Singleton {
	public static class SingletonHodler {
		private volatile static Singleton INSTANCE = new Singleton();
		private SingletonHodler() {}
	}

	private Singleton() {
	}

	public static Singleton getInstance(){
		return SingletonHodler.INSTANCE;
	}

	public void callMe() {
		System.out.println();
	}
}
