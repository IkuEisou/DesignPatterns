/**
 *
 */
package state;

/**
 * @author yuyc
 *
 */
public class ConcreteStateB implements IState {
	private static final String stateName = "B";

	// -「Singleton」パターンを適用 -------------------------------------------
	private static IState concreteStateB = new ConcreteStateB();

	private ConcreteStateB() {
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see state.IState#stateMethod1(state.Context, int)
	 */
	@Override
	public void stateMethod1(Context context, int condition) {
		if (condition == 0) {
			context.setState(ConcreteStateA.getInstance());
			System.out.println("☆☆☆☆☆ 状態変更 B -> A ★★★★★");
		}

	}

	public static IState getInstance() {
		return concreteStateB;
	}

	@Override
	public void stateMethod2(Context context) {
		context.contextMethod3(" 状態：" + stateName);
	}

}
