/**
 *
 */
package decorator;

/**
 * @author yuyc
 *
 */
public class TaxFreePrice extends SalePrice implements Price {
	TaxFreePrice(Price originalPrice) {
		super(originalPrice);
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see decorator.Price#getValue()
	 */
	@Override
	public Double getValue() {
		return getOriginalPrice().getValue() * 1.2;
	}

}
