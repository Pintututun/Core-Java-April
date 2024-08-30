package has_a_relation_21April;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the city name--");
	String name=sc.nextLine();
	System.out.print("Enter the district name--");
	String district=sc.nextLine();
	System.out.print("Enter the state name--");
	String state=sc.nextLine();
	Address ad=new Address(name,district,state);
	System.out.print("Enter the employee id--");
	int id=sc.nextInt();sc.nextLine();
	System.out.print("Enter the employee name--");
	String emp=sc.nextLine();
	Employee e=new Employee(id,emp,ad);
	System.out.println(e);
}
}
