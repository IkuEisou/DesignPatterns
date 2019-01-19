package responsibility;

public class Question {
	enum Level {LOW,MID,HIGH};
	private String question;
	private Level level;
	
	public Question(String question, Level level) {
		this.setQuestion(question);
		this.setLevel(level);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

}
