package memento;

public class Memento {
	private double result;

	Memento(double result){
		this.setResult(result);
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
}
