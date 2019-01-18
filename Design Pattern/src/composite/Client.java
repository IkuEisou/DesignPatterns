/**
 *
 */
package composite;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Directory dir1 = Directory.create("dir1");
		dir1.add(File.create("file1"));
		Directory dir2 = Directory.create("dir2");

		for (int i = 2; i < 4; i++) {
			dir1.add(File.create("file" + i));
		}

		dir1.add(dir2);
		dir1.add(File.create("file4"));
		dir1.remove();
	}

}
