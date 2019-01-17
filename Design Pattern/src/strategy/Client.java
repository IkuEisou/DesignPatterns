/**
 *
 */
package strategy;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Human h1 = new Human("Tom", 170, 60, 50);
		Human h2 = new Human("Lily", 160, 60, 30);
		int res = new Comparator(new AgeComparator()).compare(h1,
				h2);
		String youngMan = res < 0 ? h1.name : h2.name;

		System.out.println(youngMan + " is younger");

		res =  new Comparator(new HeightComparator()).compare(h1,
				h2);
		String tallMan = res >= 0 ? h1.name : h2.name;
		System.out.println(tallMan + " is taller");

		res =  new Comparator(new WeightComparator()).compare(h1,
				h2);
		String thinMan = res < 0 ? h1.name : h2.name;
		System.out.println(thinMan + " is heaviler");
	}

}
