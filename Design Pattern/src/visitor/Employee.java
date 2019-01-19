/**
 * 
 */
package visitor;

/**
 * @author yongcongyu
 *
 */
enum Sex {
	FEMALE, MALE
};

public abstract class Employee implements IAcceptor{
	private double salary;
	private String name;
	private Sex sex;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public abstract void report();
}
