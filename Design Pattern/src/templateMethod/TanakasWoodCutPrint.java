/**
 *
 */
package templateMethod;

/**
 * @author yuyc
 *
 */
public class TanakasWoodCutPrint extends WoodCutPrint {

	/* (非 Javadoc)
	 * @see templateMethod.WoodCutPrint#draw(templateMethod.Cuttable)
	 */
	@Override
	public void draw(Cuttable hanzai) {
		 System.out.println("版材にマジックを使って大好きな絵を描く");

	}

	/* (非 Javadoc)
	 * @see templateMethod.WoodCutPrint#print(templateMethod.Cuttable)
	 */
	@Override
	public void print(Cuttable hanzai) {
		System.out.println("版画インクと馬簾を使って豪快にプリントする");

	}

}
