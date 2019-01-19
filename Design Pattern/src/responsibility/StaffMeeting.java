package responsibility;

import responsibility.Question.Level;

public class StaffMeeting extends Responsible {
	private Level responsibleLevel = Level.HIGH;

	public StaffMeeting(String responsiblePerson) {
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
		System.out.println(getResponsiblePerson() + " answered!");
	}

}
