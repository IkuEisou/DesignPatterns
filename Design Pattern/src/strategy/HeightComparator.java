/**
 *
 */
package strategy;

/**
 * @author yuyc
 *
 */
public class HeightComparator  implements Comparable {

	@Override
	public int compare(Human h1, Human h2) {
		return h1.height - h2.height;
	}

}
