/**
 *
 */
package factory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yuyc
 *
 */
public class AnimalFactory extends Factory {

	/*
	 * (Javadoc)
	 *
	 * @see factory.Factory#createProduct()
	 */
	@Override
	public Swimmable createProduct(String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> cls = Class.forName("factory." + className);
		Swimmable obj = (Swimmable) cls.getConstructor().newInstance();
		return obj;
	}

}
