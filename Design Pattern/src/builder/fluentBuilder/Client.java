/**
 *
 */
package builder.fluentBuilder;

import java.util.function.Consumer;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Consumer<People> builder = people -> people.name("Tom").age(12).hobby("BaseBall");
		 System.out.println(People.hello(builder));
	}

}
