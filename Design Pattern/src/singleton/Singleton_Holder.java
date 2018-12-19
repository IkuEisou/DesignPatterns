/**
 *
 */
package singleton;
/**
 * @author yuyc
 *
 */
public final class Singleton_Holder {
	private static class SingletonHodler {
		private static Singleton_Holder INSTANCE = new Singleton_Holder();
		private SingletonHodler() {}
	}

	private Singleton_Holder() {
		System.out.println("Singleton_Holder is created!");
	}

	public static Singleton_Holder getInstance(){
		return SingletonHodler.INSTANCE;
	}
}