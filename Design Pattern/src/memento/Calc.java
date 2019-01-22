/**
 *
 */
package memento;

/**
 * @author yuyc
 *
 */
public class Calc {
	private double res = 0;

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public void plus(int oper){
		res += oper;
	}

	public Memento createMemeto(){
		return new Memento(res);
	}
}
