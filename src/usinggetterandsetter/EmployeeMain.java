package usinggetterandsetter;

import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the id--");
	int id=sc.nextInt();sc.nextLine();
	System.out.print("Enter the name--");
	String name=sc.nextLine();
	System.out.print("Enter the salary--");
	double salary=sc.nextDouble();
	Employee obj=new Employee(id,name,salary);
	if(obj.getemployeeSalary()>=900000)
		System.out.println("Developer");
	else if(obj.getemployeeSalary()>=600000)
		System.out.println("Designer");
	else System.out.println("Tester");
	
	
}
}
