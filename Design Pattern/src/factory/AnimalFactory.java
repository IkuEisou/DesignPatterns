/**
 *
 */
package factory;

/**
 * @author yuyc
 *
 */
public class AnimalFactory extends Factory {

	/*
	 * (非 Javadoc)
	 *
	 * @see factory.Factory#createProduct()
	 */
	@Override
	public Swimmable createProduct(String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls = Class.forName("factory." + className);
		Swimmable obj = (Swimmable) cls.newInstance();
		return obj;
	}

}
