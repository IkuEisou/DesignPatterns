/**
 *
 */
package templateMethod;

/**
 * @author yuyc
 *
 */
public class Wood implements Cuttable {
	private String name;
	private long length;
	private long width;
	private long high;

	public Wood(){};
	public Wood(String name, long length, long width, long high){
		this.name = name;
		this.length = length;
		this.width = width;
		this.high = high;
	}

	@Override
	public void cut() {
		System.out.println("木材を切る");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	public long getHigh() {
		return high;
	}

	public void setHigh(long high) {
		this.high = high;
	}

}
