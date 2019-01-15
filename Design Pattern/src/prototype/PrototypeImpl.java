/**
 *
 */
package prototype;

/**
 * Concrete Prototypes to clone
 */
/**
 * @author yuyc
 *
 */
public class PrototypeImpl extends PrototypeFactory {
	int x;

	public PrototypeImpl(int x) {
		this.x = x;
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see prototype.PrototypeFactory#prototypeFactory(int)
	 */
	@Override
	void prototypeFactory(int x) {
		this.x = x;

	}

	/*
	 * (非 Javadoc)
	 *
	 * @see prototype.PrototypeFactory#printValue()
	 */
	@Override
	void printValue() {
		System.out.println("Value :" + x);

	}

}
