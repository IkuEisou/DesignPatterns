/**
 *
 */
package builder;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Builder builder = new PeopleBuilder();
		 Director director = new Director(builder);
		 director.construct();
		 String people =  builder.getResult().toString();
		 System.out.println(people);
	}

}
