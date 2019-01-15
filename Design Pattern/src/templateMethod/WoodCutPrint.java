/**
 *
 */
package templateMethod;

/**
 * @author yuyc
 *
 */
public abstract class WoodCutPrint {
	public abstract void draw(Cuttable hanzai);

	public abstract void print(Cuttable hanzai);

	public void createWoodCutPrint() {
		Wood hanzai = new Wood(); // Wood クラスは、Cuttable インタフェースを実装している
		draw(hanzai);
		hanzai.cut();
		print(hanzai);
	}
}
