package usingObjectPrograms;

import java.util.Scanner;

public class Customer {
	int customerId;
	String customerName;
	String customerColor;
	double price;
	char gender;
	public void acceptProperties()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer id--");
		customerId=sc.nextInt();sc.nextLine();
		System.out.println("Enter customer name--");
		customerName=sc.nextLine();
		System.out.println("Enter customer color--");
		customerColor=sc.next();
		System.out.println("Enter price of items he purchased--");
		price=sc.nextDouble();
		System.out.println("Enter customer gender in[M/F]--");
		gender=sc.next().charAt(0);
		sc.close();
	
	}
	public void displayCustomerProperties()
	{
		System.out.println("Customer Id is "+customerId);
		System.out.println("Customer Name is "+customerName);
		System.out.println("Customer color is "+customerColor);
		System.out.println("Price of items he purchased--Rs"+price);
		System.out.println("Customer gender is "+gender);
		
	}
	public static void main(String[] args) {
		Customer obj=new Customer();
		obj.acceptProperties();
		obj.displayCustomerProperties();
		
	}
}
