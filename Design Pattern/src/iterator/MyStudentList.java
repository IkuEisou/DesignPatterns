/**
 *
 */
package iterator;

/**
 * @author yuyc
 *
 */
public class MyStudentList extends StudentList implements Aggregate {
	public MyStudentList() {
		super();
	}

	public MyStudentList(int studentCount) {
		super(studentCount);
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see iterator.Aggregate#iterator()
	 */
	@Override
	public Iterator iterator() {
		return new MyStudentListIterator(this);
	}

}
