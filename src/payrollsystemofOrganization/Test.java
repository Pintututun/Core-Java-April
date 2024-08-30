package payrollsystemofOrganization;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the details of employee--");
	System.out.print("Enter the id--");
	int id=sc.nextInt();sc.nextLine();
	System.out.print("Enter the name--");
	String name=sc.nextLine();
	System.out.print("Enter basic salary--");
	double basicSalary=sc.nextDouble();
	System.out.print("Enter the HRA Per person--");
	double hra=sc.nextDouble();
	System.out.print("Enter the Dearness allowance--");
	double da=sc.nextDouble();
	Employee emp=new Employee(id,name,basicSalary,hra,da);
	System.out.println("Enter the details of manager--");
	System.out.print("Enter the id--");
	int id1=sc.nextInt();sc.nextLine();
	System.out.print("Enter the name--");
	String name1=sc.nextLine();
	System.out.print("Enter basic salary--");
	double basicSalary1=sc.nextDouble();
	System.out.print("Enter the HRA Per person--");
	double hra1=sc.nextDouble();
	System.out.print("Enter the Dearness allowance--");
	double da1=sc.nextDouble();
	System.out.print("Enter the project allowance--");
	double pa1=sc.nextDouble();
	Manager ma=new Manager(id1,name1,basicSalary,hra1,da1,pa1);
	System.out.println("Enter the details of trainer--");
	System.out.print("Enter the id--");
	int id2=sc.nextInt();sc.nextLine();
	System.out.print("Enter the name--");
	String name2=sc.nextLine();
	System.out.print("Enter basic salary--");
	double basicSalary2=sc.nextDouble();
	System.out.print("Enter the HRA Per person--");
	double hra2=sc.nextDouble();
	System.out.print("Enter the Dearness allowance--");
	double da2=sc.nextDouble();
	System.out.print("Enter the batch count--");
	int ba2=sc.nextInt();
	System.out.print("Enter the perk per batch--");
	double perk2=sc.nextDouble();
	Trainer train=new Trainer(id2,name2,basicSalary2,hra2,da2,ba2,perk2);
	System.out.println("Enter the details of sourcing--");
	System.out.print("Enter the id--");
	int id3=sc.nextInt();sc.nextLine();
	System.out.print("Enter the name--");
	String name3=sc.nextLine();
	System.out.print("Enter basic salary--");
	double basicSalary3=sc.nextDouble();
	System.out.print("Enter the HRA Per person--");
	double hra3=sc.nextDouble();
	System.out.print("Enter the Dearness allowance--");
	double da3=sc.nextDouble();
	System.out.print("Enter the enrollment target--");
	int et3=sc.nextInt();
	System.out.print("Enter the enrollment reached--");
	int er3=sc.nextInt();
	System.out.print("Enter the perk per enrollment--");
	double ppe3=sc.nextDouble();
	Sourcing source=new Sourcing(id3,name3,basicSalary3,hra3,da3,et3,er3,ppe3);
	TaxUtil tu=new TaxUtil();
	System.out.println("Tax\n---------");
	System.out.println("Employee tax\n----------\n"+tu.calculateTax(emp));
	System.out.println("Manager tax\n-----------\n"+tu.calculateTax(ma));
	System.out.println("Trainer tax\n------------\n"+tu.calculateTax(train));
	System.out.println("Sourcing tax\n-----------\n"+tu.calculateTax(source));
	
}
}
