/**
 *
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker
 *
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Memento> history = new ArrayList<Memento>();

		for (int i = 0; i < 2; i++) {
			Calc calc = new Calc();
			if (history.size() > 0 && (i - 1) < history.size()) {
				calc.setMemento(history.get(i - 1));
			}

			for (int j = i * 5 + 1; j < i * 5 + 6; j++) {
				calc.plus(j);
			}
			System.out.println(calc.getRes());
			history.add(calc.createMemeto(calc.getRes()));
		}
	}

}
