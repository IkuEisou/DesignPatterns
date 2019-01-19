package responsibility;

public class Student extends Responsible {

	public Student(String responsiblePerson) {
		super(responsiblePerson);
	}

	@Override
	protected boolean beAbleToJudge(Question question) {
		return false;
	}

	@Override
	protected void judge(Question question) {

	}

}
