package april_20Employee;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Enter the number of objects--");
		int number = tc.nextInt();
		for (int i = 1; i <= number; i++) {
			Employee obj1 = Employee.getEmployeeObject();
			System.out.println(obj1);
		}
	}
}
