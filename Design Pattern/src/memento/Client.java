/**
 *
 */
package memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Memento> map = new HashMap<String, Memento>();
		Calc calc = new Calc();
		for (int i = 1; i < 6; i++) {
			calc.plus(i);
		}
		System.out.println(calc.getRes());

		map.put("BeforeRes", calc.createMemeto());

		Calc calc2 = new Calc();
		calc2.setRes(map.get("BeforeRes").getResult());
		for (int i = 6; i < 11; i++) {
			calc2.plus(i);
		}
		System.out.println(calc2.getRes());
		map.put("AfterRes", calc2.createMemeto());
	}

}
