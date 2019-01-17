/**
 *
 */
package bridge;

/**
 * @author yuyc
 *
 */
public class Client {
	public static void main(String[] args) {
		TimerSort timerSort = new TimerSort(new QuickSorter());
		timerSort.timerSort(null);
		timerSort = new TimerSort(new BubbleSorter());
		timerSort.timerSort(null);
	}
}
