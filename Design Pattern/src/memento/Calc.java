/**
 *
 */
package memento;

/**
 * Originator
 *
 * @author yuyc
 *
 */
public class Calc {
	private double res;

	public double getRes() {
		return res;
	}

	public void setMemento(Memento memento) {
		this.res = memento.getRes();
	}

	public void plus(int oper) {
		res += oper;
	}

	public Memento createMemeto(double res) {
		return new Memento(res);
	}
}
