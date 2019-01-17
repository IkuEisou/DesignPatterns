/**
 *
 */
package builder.effectiveJavaBuilder;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String people =  new People.Builder("Tom", 12).hobby("BaseBall").build().hello();
		System.out.println(people);
	}

}
