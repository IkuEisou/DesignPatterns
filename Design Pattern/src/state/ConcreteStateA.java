/**
 *
 */
package state;

/**
 * @author yuyc
 *
 */
public class ConcreteStateA implements IState {
	private static final String stateName = "A";
	// -「Singleton」パターンを適用 -------------------------------------------
	private static IState concreteStateA = new ConcreteStateA();

	private ConcreteStateA() {
	}

	public static IState getInstance() {
		return concreteStateA;
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see state.IState#stateMethod1(state.Context, int)
	 */
	@Override
	public void stateMethod1(Context context, int condition) {
		if (condition == 1) {
			context.setState(ConcreteStateB.getInstance());
			System.out.println("★★★★★ 状態変更 A -> B ☆☆☆☆☆");
		}

	}

	@Override
	public void stateMethod2(Context context) {
		context.contextMethod3(" 状態：" + stateName);

	}

}
