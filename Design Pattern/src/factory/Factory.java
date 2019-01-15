/**
 *
 */
package factory;

/**
 * @author yuyc
 *
 */
public abstract class Factory {
	public abstract Swimmable createProduct(String name)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException;
}
