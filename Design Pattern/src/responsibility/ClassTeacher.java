package responsibility;

import responsibility.Question.Level;

public class ClassTeacher extends Responsible {
	private Level responsibleLevel = Level.LOW;

	public ClassTeacher(String responsiblePerson) {
		super(responsiblePerson);
	}

	@Override
	protected boolean beAbleToJudge(Question question) {
		if (question.getLevel().compareTo(responsibleLevel) <= 0) {
			return true;
		}
		return false;
	}

	@Override
	protected void judge(Question question) {
		System.out.println("ClassTeacher answered!");

	}

}
