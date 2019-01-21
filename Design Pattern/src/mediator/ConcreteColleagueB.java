/**
 *
 */
package mediator;

/**
 * @author yuyc
 *
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(String name) {
        super(name);
    }

    public void advice(String msg) {
        System.out.println("ConcreteColleagueB:" + msg);
    }

}
