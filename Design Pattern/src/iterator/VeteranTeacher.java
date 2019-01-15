package iterator;

/**
 * iterator 使用
 *
 * @author yuyc
 *
 */
public class VeteranTeacher extends Teacher {
	private MyStudentList studentList;

	@Override
	public void createStudentList() {
		studentList = new MyStudentList(5);
		studentList.add(new Student("鳥山明", "男性"));
		studentList.add(new Student("高橋留美子", "女性"));
		studentList.add(new Student("車田正美", "男性"));
		studentList.add(new Student("藤子不二雄", "男性"));
		studentList.add(new Student("大川七瀬", "女性"));
	}

	@Override
	public void callStudents() {
		Iterator it = studentList.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student.getName() + "(" + student.getSex() + ")");
		}

	}

}
