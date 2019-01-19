/**
 * 
 */
package responsibility;

/**
 * @author yongcongyu
 *
 */
public abstract class Responsible {
	private Responsible next = null;
	private String responsiblePerson = null;

	public Responsible(String responsiblePerson) {
		this.setResponsiblePerson(responsiblePerson);
	}

	public Responsible setNext(Responsible next) {
		this.next = next;
		return next;
	}

	public final void putQuestion(Question question) {
		if (beAbleToJudge(question)) {
			judge(question);
		} else if (next != null) {
			next.putQuestion(question);
		} else {
			System.out.println("誰にも判断できませんでした。やってみなさい。");
		}
	}

	protected abstract boolean beAbleToJudge(Question question);

	protected abstract void judge(Question question);

	public String getResponsiblePerson() {
		return responsiblePerson;
	}

	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
}
