/**
 *
 */
package abstractFactory;

/**
 * @author yuyc
 *
 */
public class SurfaceFactory implements PCFactory {

	/* (非 Javadoc)
	 * @see abstractFactory.PCFactory#createMouse()
	 */
	@Override
	public Mouse createMouse() {
		return new NoteMouse();
	}

	/* (非 Javadoc)
	 * @see abstractFactory.PCFactory#createKeybo()
	 */
	@Override
	public Keybo createKeybo() {
		return new NoteKeybo();
	}

}
