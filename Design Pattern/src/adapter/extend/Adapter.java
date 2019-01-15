/**
 *
 */
package adapter.extend;

/**
 * @author yuyc
 *
 */
public class Adapter extends Target{
	private Adaptee adaptee;

	public Adapter(){
		adaptee = new Adaptee();
	}

	@Override
	void targetMethod() {
		System.out.println("抽象クラスのメソッドを実装した！");
		adaptee.method();
	}

}
