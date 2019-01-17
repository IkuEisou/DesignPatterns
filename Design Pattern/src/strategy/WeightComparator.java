/**
 *
 */
package strategy;

/**
 * @author yuyc
 *
 */
public class WeightComparator implements Comparable {

	/* (非 Javadoc)
	 * @see strategy.Comparator#compare(strategy.Human, strategy.Human)
	 */
	@Override
	public int compare(Human h1, Human h2) {
		return h1.weight - h2.weight;
	}

}
