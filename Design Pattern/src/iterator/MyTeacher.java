/**
 *
 */
package iterator;

/**
 * iterator 不使用
 * @author yuyc
 *
 */
public class MyTeacher extends Teacher {
	private StudentList studentList;

	/*
	 * (非 Javadoc)
	 *
	 * @see iterator.Teacher#createStudentList()
	 */
	@Override
	public void createStudentList() {
		studentList = new StudentList(5);
		studentList.add(new Student("鳥山明", "男性"));
		studentList.add(new Student("高橋留美子", "女性"));
		studentList.add(new Student("車田正美", "男性"));
		studentList.add(new Student("藤子不二雄", "男性"));
		studentList.add(new Student("大川七瀬", "女性"));
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see iterator.Teacher#callStudents()
	 */
	@Override
	public void callStudents() {
		int size = studentList.getLastNum();
		for (int n = 0; n < size; n++) {
			System.out.println(studentList.getStudentAt(n).getName());
		}
	}

}
