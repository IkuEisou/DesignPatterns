/**
 *
 */
package builder;

/**
 * @author yuyc
 *
 */
enum Material{WOOD, CLAY, CONCRETE, SNOW}

public class People {
    private String name;
	private Integer age;
    private String hobby;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

    public String toString(){
        return "[Name:" + this.name + ", Age:" + this.age + ", Hobby:" + this.hobby + "]";
    }
}
