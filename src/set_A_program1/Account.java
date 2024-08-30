package set_A_program1;

public class Account {
Customer customer;
double balance;
int accountNo;
float interestRate;
public Account(Customer customer, double balance, int accountNo, float interestRate) 
{	
	super();
	this.customer =new Customer(customer);
	this.balance = balance;
	this.accountNo = accountNo;
	this.interestRate = interestRate;
}
public String deposit(double amount)
{
	this.balance=this.balance+amount;
	return ""+this.balance;
}
public String withdraw(double amount)
{
	if(amount<this.balance)
	{
		this.balance=this.balance-amount;
		return ""+this.balance;
	}
	else
		return "Not possible to withdraw";
}
   
}
