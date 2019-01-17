/**
 *
 */
package strategy;

/**
 * @author yuyc
 *
 */
public class Comparator {
	private Comparable c = null;

	public Comparator(Comparable c){
		this.c = c;
	}

	public int compare(Human h1,Human h2){
		return c.compare(h1, h2);
	}
}
