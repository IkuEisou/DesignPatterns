/**
 *
 */
package factory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnimalFactory factory = new AnimalFactory();
		Swimmable pd;
		try {
			pd = factory.createProduct("Duck");
			pd.swim();
			pd = factory.createProduct("Fish");
			pd.swim();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
