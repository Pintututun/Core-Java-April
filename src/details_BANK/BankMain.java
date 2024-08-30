package details_BANK;

import java.util.Scanner;

public class BankMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Bank name--");
	String bname=sc.nextLine();
	System.out.println("Enter customer name--");
	String custName=sc.nextLine();
	System.out.println("Enter Bank address--");
	String addr=sc.nextLine();
	System.out.println("Enter Bank IFSC code--");
	String bifsc=sc.nextLine();
	System.out.println("Enter customer account number--");
	Long acc=sc.nextLong();
	System.out.println("Enter current balance--");
	int cur=sc.nextInt();
	Bank b=new Bank();
	b.setDetails(bname, custName, addr, bifsc, acc, cur);
	System.out.println("Enter 1 : Withdraw");
	System.out.println("Enter 2 : Deposit");
	System.out.println("Enter 3 : Current Balance");
	System.out.println("Enter 4 : Display Deytails");
	System.out.print("Enter the option--");
	int opt=sc.nextInt();
	if(opt==1)
		{
		System.out.print("Enter the amount to withdraw-");
		double amount=sc.nextDouble();
		b.withdraw(amount);
		}
	else 
	{
		System.out.println("Enter the amount to deposit-");
		double amount=sc.nextDouble();
		b.deposit(amount);
	}
	System.out.println(b.displayDetails());

	
}
}
