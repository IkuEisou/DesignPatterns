/**
 *
 */
package abstractFactory;

/**
 * 抽象工場：複数部品を製造して、製品を組み合わせる場合、使う。
 * 利点：製品の拡張性が強まる
 * 欠点：部品の拡張性が「OCP: オープンクローズドの原則」に違反
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PCFactory fact = new MacFactory();
		fact.testPC();
		fact = new SurfaceFactory();
		fact.testPC();
	}

}
