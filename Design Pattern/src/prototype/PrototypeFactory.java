/**
 *
 */
package prototype;

/**
 * @author yuyc
 *
 */
/**
 * Prototype Class
 */
abstract class PrototypeFactory implements Cloneable {
	public Object clone() throws CloneNotSupportedException {
		PrototypeFactory copy = (PrototypeFactory) super.clone();
		return copy;
	}

	abstract void prototypeFactory(int x);

	abstract void printValue();
}
