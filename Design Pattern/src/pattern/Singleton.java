/**
 *
 */
package pattern;
/**
 * @author yuyc
 *
 */
public final class Singleton {
	private static class SingletonHodler {
		private static Singleton INSTANCE = new Singleton();
		private SingletonHodler() {}
	}

	private Singleton() {
	}

	public static Singleton getInstance(){
		return SingletonHodler.INSTANCE;
	}
}
