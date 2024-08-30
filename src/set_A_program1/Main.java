package set_A_program1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the firstname:");
	  String fname=sc.nextLine();
	  System.out.print("Enter the lastname:");
	 String lname=sc.nextLine();
	Customer obj1 = new Customer(fname, lname);
	 System.out.print("Enter the balance:");
	 double bal=sc.nextDouble();
	 System.out.print("Enter the account number:");
	 int num=sc.nextInt();
	 System.out.print("Enter the interest rate:");
	 float irate=sc.nextFloat();
	Account obj2 = new Account(obj1, bal, num, irate);
	System.out.println("-------------------------------------------");
	System.out.println("Press 1:Deposit");
	System.out.println("Press 2:Withdraw");
	int option=sc.nextInt();
	if(option==1)
	{
		System.out.print("Enter the amount to deposit:");
		double amount=sc.nextDouble();
		String result=obj2.deposit(amount);
		System.out.println(result);
	}
	else
	{
		System.out.print("Enter the amount to withdraw:");
		double amount=sc.nextDouble();
		String result=obj2.withdraw(amount);
		System.out.println(result);
	}
}
}
