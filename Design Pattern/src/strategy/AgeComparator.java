/**
 *
 */
package strategy;

/**
 * @author yuyc
 *
 */
public class AgeComparator implements Comparable {

	/* (非 Javadoc)
	 * @see strategy.Comparator#compare(strategy.Human, strategy.Human)
	 */
	@Override
	public int compare(Human h1, Human h2) {
		return h1.age - h2.age;
	}

}
