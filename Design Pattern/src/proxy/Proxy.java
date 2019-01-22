/**
 *
 */
package proxy;

/**
 * @author yuyc
 *
 */
public class Proxy implements ISubject {
	private RealSubject real;

	public Proxy(RealSubject real) {
		super();
		this.setReal(real);
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see proxy.ISubject#request1()
	 */
	@Override
	public void request1() {
		System.out.println("それは「～～解答1～～」です。");

	}

	/*
	 * (非 Javadoc)
	 *
	 * @see proxy.ISubject#request2()
	 */
	@Override
	public void request2() {
		System.out.println("それは「～～解答2～～」です。");

	}

	/*
	 * (非 Javadoc)
	 *
	 * @see proxy.ISubject#request3()
	 */
	@Override
	public void request3() {
		System.out.print("答えは「");
		// 代理には答えられないので、人に聞く
		real.request3();
		System.out.println("」となります。");

	}

	public RealSubject getReal() {
		return real;
	}

	public void setReal(RealSubject real) {
		this.real = real;
	}

}
