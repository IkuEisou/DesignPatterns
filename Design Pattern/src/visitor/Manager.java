/**
 * 
 */
package visitor;

/**
 * @author yongcongyu
 *
 */
public class Manager extends Employee {
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public void report() {
		System.out.println("姓名:" + getName() + " 性别:" + getSex() + " 薪资:" + getSalary() + " 业绩："
				+ getPerformance());

	}

}
