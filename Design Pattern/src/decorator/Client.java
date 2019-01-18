/**
 *
 */
package decorator;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Price prPrice = new PrimePrice(3000.5);
		Double price = prPrice.getValue();
		System.out.println("基本料金" + price);

		Price salePrice = new TaxFreePrice(prPrice);
		Double taxfree = salePrice.getValue();
		System.out.println("税抜価格" + taxfree);

		Price taxPrice = new TaxPrice(salePrice);
		Double tax = taxPrice.getValue();
		System.out.println("税込価格" + tax);
	}

}
