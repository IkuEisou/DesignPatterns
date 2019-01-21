/**
 *
 */
package observer;

import java.util.ArrayList;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator(new  ArrayList<Observer>());
        Observer degitObserver = new DegitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addObserver(degitObserver);
        generator.addObserver(graphObserver);
        generator.execute();
	}

}
