/**
 *
 */
package factory;

/**
 * @author yuyc
 *
 */
public class Fish implements Swimmable {

	/* (非 Javadoc)
	 * @see factory.Swimmable#swim()
	 */
	@Override
	public void swim() {
		System.out.println("Fish can swim!");
	}

}
