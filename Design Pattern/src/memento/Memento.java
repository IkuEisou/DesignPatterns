package memento;

public class Memento {
	private double res;

	Memento(double result){
		this.setRes(result);
	}

	public double getRes() {
		return res;
	}

	public void setRes(double result) {
		this.res = result;
	}
}
