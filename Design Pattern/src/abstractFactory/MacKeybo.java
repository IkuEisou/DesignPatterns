/**
 *
 */
package abstractFactory;

/**
 * @author yuyc
 *
 */
public class MacKeybo extends Keybo {

	@Override
	void pressKey() {
		System.out.println(this.getClass().getSimpleName() + " is pressed!");

	}

}
