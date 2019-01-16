/**
 *
 */
package abstractFactory;

/**
 * @author yuyc
 *
 */
public class NoteKeybo extends Keybo {

	/*
	 * (非 Javadoc)
	 *
	 * @see abstractFactory.Keybo#pressKey()
	 */
	@Override
	void pressKey() {
		System.out.println(this.getClass().getSimpleName() + " is pressed!");
	}

}
