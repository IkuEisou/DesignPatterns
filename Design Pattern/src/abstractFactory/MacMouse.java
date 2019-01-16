/**
 *
 */
package abstractFactory;

/**
 * @author yuyc
 *
 */
public class MacMouse extends Mouse {

	/* (非 Javadoc)
	 * @see abstractFactory.Mouse#move()
	 */
	@Override
	void move() {
		System.out.println(this.getClass().getSimpleName() + " is moving!");
	}
}
