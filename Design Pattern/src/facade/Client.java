/**
 * 
 */
package facade;

/**
 * @author yongcongyu
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //窓口
        Librarian librarian = new Librarian();
        String result = librarian.searchBook("図鑑");
        if(result.equals("貸出中です")){
            System.out.println("貸出中かよ…");
        }else if(result.equals("その本は所蔵していません")){
            System.out.println("なんだ、ないのか");
        }else{
            System.out.println("サンキュ！");
        }

	}

}
