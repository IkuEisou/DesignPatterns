/**
 *
 */
package decorator;

/**
 * 原価を表すクラス
 * @author yuyc
 *
 */
public class PrimePrice implements Price {
    private Double value;

    PrimePrice(Double value){
        this.value = value;
    }

	/* (非 Javadoc)
	 * @see decorator.Price#getValue()
	 */
	@Override
	public Double getValue() {
		return this.value;
	}

}
