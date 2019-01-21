/**
 *
 */
package mediator;

/**
 * @author yuyc
 *
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(String name) {
        super(name);
    }

    public void advice(String msg) {
        System.out.println("ConcreteColleagueA:" + msg);
    }

}
