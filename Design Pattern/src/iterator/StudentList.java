/**
 *
 */
package iterator;

/**
 * @author yuyc
 *
 */
public class StudentList {
	protected Student[] students;
	private int last = 0;

	public StudentList(){}
	public StudentList(int leng){
		this.students = new Student[leng];
	}

	public void add(Student student) {
		students[last] = student;
		last++;
	}

	public Student getStudentAt(int index){
		return students[index];
	}

	public int getLastNum(){
		return last;
	}
}
