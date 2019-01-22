/**
 *
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Memento> history = new ArrayList<Memento>();
		Calc calc = new Calc();
		for (int i = 1; i < 6; i++) {
			calc.plus(i);
		}
		System.out.println(calc.getRes());

		history.add(calc.createMemeto());

		Calc calc2 = new Calc();
		calc2.setMemento(history.get(0));
		for (int i = 6; i < 11; i++) {
			calc2.plus(i);
		}
		System.out.println(calc2.getRes());
		history.add(calc2.createMemeto());
	}

}
