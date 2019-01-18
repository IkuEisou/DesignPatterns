/**
 *
 */
package composite;

/**
 * @author yuyc
 *
 */
public class File implements IO_Operator {
	private String name = null;

	private File(String name) {
		this.name = name;
	}

	public static File create(String name) {
		System.out.println(name + "ファイル新規作成");
		return new File(name);
	}

	@Override
	public void remove() {
		System.out.println(name + "ファイル削除");
	}

}
