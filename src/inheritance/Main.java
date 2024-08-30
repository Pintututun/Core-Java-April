package inheritance;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the id-- ");
	int id=sc.nextInt();sc.nextLine();
	System.out.print("Enter the name--");
	String name=sc.nextLine();
	System.out.print("Enter the exam fee--");
	double efee=sc.nextDouble();
	System.out.println("Enter 1:DayScholar");
	System.out.println("Enter 2:Hosteller");
	int option=sc.nextInt();
	if(option==1)
	{
	System.out.print("Enter the transport fee--");
	double tfee=sc.nextDouble();
	DayScholar d=new DayScholar(id,name,efee,tfee);
	System.out.print("Enter amount to pay--");
	double a=sc.nextDouble();
    double result=d.payFee(a);
     System.out.println(d.displayDetails()+"  you have to pay "+ result);
	}
	else
	{
	System.out.print("Enter the hostel fee--");
	double hfee=sc.nextDouble();
    Hosteller h=new Hosteller(id,name,efee,hfee);
    System.out.print("Enter amount to pay--");
    double a=sc.nextDouble();
    double result=h.payFee(a);
    System.out.println(h.displayDetails()+"you have to pay"+result);
	}
}
}
