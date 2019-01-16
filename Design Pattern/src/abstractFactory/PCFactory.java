/**
 *
 */
package abstractFactory;

/**
 * @author yuyc
 *
 */
public interface PCFactory {
	abstract Mouse createMouse();
	abstract Keybo createKeybo();
	default void testPC() {
		Keybo keyboard = createKeybo();
		keyboard.pressKey();
		Mouse mouse = createMouse();
		mouse.move();
	}
}
