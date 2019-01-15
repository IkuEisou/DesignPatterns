/**
 *
 */
package iterator;

/**
 * @author yuyc
 *
 */
public class MyStudentListIterator implements Iterator {
	private MyStudentList myStudentList;
	private int index;

	public MyStudentListIterator() {
	}

	public MyStudentListIterator(MyStudentList list) {
		this.myStudentList = list;
		this.index = 0;
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return myStudentList.getLastNum() > index;
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see iterator.Iterator#next()
	 */
	@Override
	public Student next() {
		Student s = myStudentList.getStudentAt(index);
		index++;
		return s;
	}

}
