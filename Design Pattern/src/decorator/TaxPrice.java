/**
 *
 */
package decorator;

/**
 * @author yuyc
 *
 */
public class TaxPrice extends SalePrice  implements Price {

	TaxPrice(Price price) {
		super(price);
	}

	@Override
	public Double getValue() {
		return getOriginalPrice().getValue() * 1.08;
	}

}
