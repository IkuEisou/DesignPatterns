package observer;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberGenerator  extends NumberGenerator{
    private int number;

    public RandomNumberGenerator(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public int getNumber() {
        return number;
    }

    public void execute() {
    	Random random = new Random();
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
