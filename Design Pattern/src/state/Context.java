/**
 *
 */
package state;

/**
 * @author yuyc
 *
 */
public class Context {
	private IState state = null;

	public Context() {
		state = ConcreteStateA.getInstance();
	}

	public void setState(IState state) {
		this.state = state;
	}

	public void contextMethod1(int condition) {
		state.stateMethod1(this, condition);
	}

	public void contextMethod2() {
		state.stateMethod2(this);
	}

	public void contextMethod3(String msg) {
		System.out.println(msg);
	}
}
