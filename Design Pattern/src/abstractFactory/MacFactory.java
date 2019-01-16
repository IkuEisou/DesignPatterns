/**
 *
 */
package abstractFactory;

/**
 * @author yuyc
 *
 */
public class MacFactory implements PCFactory {

	/* (非 Javadoc)
	 * @see abstractFactory.PCFactory#createMouse()
	 */
	@Override
	public Mouse createMouse() {
		return new MacMouse();
	}

	/* (非 Javadoc)
	 * @see abstractFactory.PCFactory#createKeybo()
	 */
	@Override
	public Keybo createKeybo() {
		return new MacKeybo();
	}

}
