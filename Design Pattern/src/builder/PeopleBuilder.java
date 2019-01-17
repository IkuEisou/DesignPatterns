/**
 *
 */
package builder;

/**
 * @author yuyc
 *
 */
public class PeopleBuilder implements Builder {
	private People people;

	PeopleBuilder() {
		this.people = new People();
	}

	PeopleBuilder(People people) {
		this.people = people;
	}

	@Override
	public void name(String name) {
		people.setName(name);

	}

	@Override
	public void age(Integer age) {
		people.setAge(age);

	}

	@Override
	public void hobby(String hobby) {
		people.setHobby(hobby);

	}

	@Override
	public People getResult() {
		if (null == people.getName() || null == people.getAge()) {
			throw new NullPointerException();
		}
		return this.people;
	}

}
