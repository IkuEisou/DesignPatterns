/**
 *
 */
package bridge;

/**
 * @author yuyc
 *
 */
public class SorterBridge {
	private Sorter sorter;

	public SorterBridge(Sorter sorter) {
		this.sorter = sorter;
	}

	public void sort(Object obj[]) {
		sorter.sort(obj);
	}
}
