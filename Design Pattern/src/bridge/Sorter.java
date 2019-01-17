/**
 *
 */
package bridge;

/**
 * @author yuyc
 *
 */
public interface Sorter {
	default void sort(Object obj[]){
		System.out.println(this.getClass().getSimpleName() + " is called!");
	}
}
