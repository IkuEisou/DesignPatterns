/**
 *
 */
package factory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yuyc
 *
 */
public abstract class Factory {
	public abstract Swimmable createProduct(String name)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException;
}
