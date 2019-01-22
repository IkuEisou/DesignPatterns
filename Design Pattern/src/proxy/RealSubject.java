/**
 *
 */
package proxy;

/**
 * @author yuyc
 *
 */
public class RealSubject implements ISubject {

	/* (非 Javadoc)
	 * @see proxy.ISubject#request1()
	 */
	@Override
	public void request1() {
		 System.out.print("～～解答1～～");

	}

	/* (非 Javadoc)
	 * @see proxy.ISubject#request2()
	 */
	@Override
	public void request2() {
		 System.out.print("～～解答2～～");

	}

	/* (非 Javadoc)
	 * @see proxy.ISubject#request3()
	 */
	@Override
	public void request3() {
		System.out.print("～～解答3～～");

	}

}
