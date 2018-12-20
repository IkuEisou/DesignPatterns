/**
 *
 */
package singleton;

/**
 * @author yuyc
 *
 */
public class Singleton_static_final {
	private static final Singleton_static_final singleton = new Singleton_static_final();

	private Singleton_static_final() {
	}

	public static Singleton_static_final getInstance() {
		return singleton;
	}
}
