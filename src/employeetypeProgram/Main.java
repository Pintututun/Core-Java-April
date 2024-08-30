package employeetypeProgram;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name--");
	String name=sc.nextLine();
	System.out.print("Enter the age--");
	int age=sc.nextInt();
	System.out.print("Enter the salary--");
	double salary=sc.nextDouble();sc.nextLine();
	System.out.print("Enter the department--");
	String depart=sc.nextLine();
	Employee emp=new Employee(name,age,salary,depart);
	System.out.println("Enter the salary want to raise by how percentage--");
	double percentage=sc.nextDouble();
	double newSalary=emp.raiseSalary(percentage);
	System.out.println(emp);
	System.out.println("After raising the salary--------------");
	emp.setSalary(newSalary);
	Employee emp1=new Employee(emp);
	System.out.println(emp1);
}
}
