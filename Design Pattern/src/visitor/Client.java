/**
 * 
 */
package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yongcongyu
 *
 */
public class Client {
	public static List<Employee> mockEmployee() {
		List<Employee> employeeLst = new ArrayList<Employee>();
		CommonEmployee zhang = new CommonEmployee();
		zhang.setJob("PG");
		zhang.setName("Zhang");
		zhang.setSex(Sex.MALE);
		zhang.setSalary(3200.0);
		employeeLst.add(zhang);

		CommonEmployee li = new CommonEmployee();
		li.setJob("SE");
		li.setName("Li");
		li.setSex(Sex.FEMALE);
		li.setSalary(6200.0);
		employeeLst.add(li);

		Manager wang = new Manager();
		wang.setName("Wang");
		wang.setPerformance("NG");
		wang.setSalary(18000);
		wang.setSex(Sex.MALE);
		employeeLst.add(wang);

		return employeeLst;
	}

	public static void main(String[] args) {
		for (Employee emp : mockEmployee()) {
			emp.accept(new Visitor());
		}
	}

}
