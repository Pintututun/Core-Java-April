package april_20Employee;

import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public Employee(int id, String name, double salary) {
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;
	}

	public static Employee getEmployeeObject() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id--");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name--");
		String name = sc.nextLine();
		System.out.print("Enter the salary--");
		double salary = sc.nextDouble();
		Employee obj = new Employee(id, name, salary);
		
		return obj;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	

	
}
