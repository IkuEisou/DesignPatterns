/**
 * 
 */
package visitor;

/**
 * @author yongcongyu
 *
 */
public class CommonEmployee extends Employee {
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void report() {
		System.out.println(
				"姓名:" + getName() + " 性别:" + getSex() + " 薪资:" + getSalary() +  " 工作:" + getJob());
	}

}
