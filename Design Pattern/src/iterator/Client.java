/**
 *
 */
package iterator;

/**
 * @author yuyc
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Teacher you = new MyTeacher();
		Teacher you = new VeteranTeacher();
		you.createStudentList();
		you.callStudents();
	}

}
