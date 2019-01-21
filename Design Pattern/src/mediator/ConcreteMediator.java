/**
 *
 */
package mediator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author yuyc
 *
 */
public class ConcreteMediator extends Mediator {
	Map<String, Colleague> colleagues = new HashMap<String, Colleague>();

	@Override
	public void addColleague(Colleague colleague) {
		colleagues.put(colleague.getName(), colleague);

	}

	@Override
	public void consultation(Colleague colleague) {
		String name = colleague.getName();
		System.out.println(name + "からの相談です。");
		Iterator<String> it = colleagues.keySet().iterator();
		while (it.hasNext()) {
			Colleague colleagueTmp = (Colleague) colleagues.get(it.next());
			if (!(colleagueTmp.getName().equals(colleague.getName()))) {
				colleagueTmp.advice(name + "からの相談がありましたよ。");
			}
		}
	}

}
