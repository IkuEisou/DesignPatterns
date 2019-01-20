/**
 * 
 */
package facade;

/**
 * @author yongcongyu
 *
 */
public class Librarian {
	public String searchBook(String bookName) {
		System.out.println(bookName + "を探しています。");
		// 本を探す
		BookList bookList = new BookList();
		String location = bookList.searchBook(bookName);
		// 本の場所がnullではない(所蔵してる)とき
		if (location != null) {
			// 貸出中かチェックする
			LendingList lendingList = new LendingList();
			if (lendingList.check(bookName)) {
				// 貸出中のとき
				location = "貸出中です";
			} else {
				// 貸出中ではないとき
				location = "在庫です";
			}
			// 所蔵してないとき
		} else {
			location = "その本は所蔵していません";
		}
		System.out.println(location + "。");
		return location;
	}
}
