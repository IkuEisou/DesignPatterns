/**
 * 
 */
package responsibility;

import responsibility.Question.Level;

/**
 * @author yongcongyu
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Responsible nakagawa = new Student("新ちゃん");
		Responsible rookie = new ClassTeacher("新人先生");
		Responsible veteran = new ChiefTeacher("ベテラン先生");
		Responsible staffMeeting = new StaffMeeting("職員会議");
		nakagawa.setNext(rookie).setNext(veteran).setNext(staffMeeting);
		nakagawa.putQuestion(new Question("今日の宿題は？", Level.LOW));
		nakagawa.putQuestion(new Question("新人先生の名前は？", Level.MID));
		nakagawa.putQuestion(new Question("携帯電話持って行ってよい？", Level.HIGH));
	}

}
