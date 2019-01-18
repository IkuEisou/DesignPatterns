/**
 *
 */
package decorator;

/**
 * @author yuyc
 *
 */
public abstract class SalePrice{
	private Price originalPrice;

	public Price getOriginalPrice() {
		return originalPrice;
	}

	SalePrice(Price price) {
		this.originalPrice = price;
	}
}
