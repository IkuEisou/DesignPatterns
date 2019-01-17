/**
 *
 */
package bridge;

/**
 * @author yuyc
 *
 */
public class TimerSort extends SorterBridge {
	public TimerSort(Sorter sorter) {
		super(sorter);
	}

	public void timerSort(Object obj[]) {
		long start = System.currentTimeMillis();
		sort(obj);
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));
	}
}
