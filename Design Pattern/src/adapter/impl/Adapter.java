/**
 *
 */
package adapter.impl;

/**
 * @author yuyc
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void targetMethod() {
		System.out.println("インターフェースのメソッドを実装した！");
		method();
	}

}
