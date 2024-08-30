package has_a_relationpart_2_April21;

import java.util.Scanner;

public class Zomato {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the order id--");
	int order=sc.nextInt();sc.nextLine();
	System.out.print("Enter the item name--");
	String iname=sc.nextLine();
	System.out.print("Enter the item price--");
	double price=sc.nextDouble();
	Order od=new Order(order,iname,price);
	System.out.print("Enter the customer id--");
	int cusid=sc.nextInt();sc.nextLine();
	System.out.print("Enter the customer name--");
	String cusname=sc.nextLine();
	System.out.print("Enter the customer address--");
	String cusadd=sc.nextLine();
	Customer c=new Customer(cusid,cusname,cusadd,od);
	System.out.println(c);
	
}
}
