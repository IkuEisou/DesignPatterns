/**
 *
 */
package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Subject Class
 *
 * @author yuyc
 *
 */
public abstract class NumberGenerator {
	protected ArrayList<Observer> observers;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer obserber = (Observer) iterator.next();
			obserber.update(this);
		}
	}

	public abstract int getNumber();

	public abstract void execute();
}
