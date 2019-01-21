/**
 *
 */
package mediator;

/**
 * @author yuyc
 *
 */
public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colA = new ConcreteColleagueA("A");
        Colleague colB = new ConcreteColleagueB("B");
        mediator.addColleague(colA);
        mediator.addColleague(colB);
        colA.setMediator(mediator);
        colB.setMediator(mediator);
        colA.run();
        colB.run();
	}
}
