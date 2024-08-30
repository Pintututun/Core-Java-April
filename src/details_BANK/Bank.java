package details_BANK;

public class Bank {
private String bankName;
private String bankCustomerName;
private String bankAddress;
private String bankIFSCCode;
private Long customerAccountNumber;
private int currentBalance;
public void setDetails(String name,String custname,String addr,String ifsc,Long account,int balance )
{
	this.bankName=name;
	this.bankCustomerName=custname;
	this.bankAddress=addr;
	this.bankIFSCCode=ifsc;
	this.customerAccountNumber=account;
	this.currentBalance=balance;
}
public void withdraw(double amount)
{    
	if(currentBalance<=1000.0)
		System.out.println("Insufficient Balance ");
	else 
	{
		currentBalance=currentBalance-(int)amount;
		if(currentBalance<1000)
		{
			System.out.println("Plz Maintain Minimum balance of 1000 ");
			System.out.println("Transaction succesful");
		System.out.println("Available balance--"+currentBalance);
		}
		else
		{
			System.out.println("Transaction successful");
			System.out.println("Available balance--"+currentBalance);
		
		}
	}	
}
public void deposit(double amount)
{
	if(currentBalance<=1000.0)
	{
		System.out.println("Plz Maintain Minimum Balance of 1000 ");
	}
	currentBalance=currentBalance+(int)amount;
	System.out.println("Transaction Successful");
	System.out.println("Available balance--"+currentBalance);
}
public void currentBalance()
{
	System.out.println("Transaction Succesfully--");
	System.out.println("Available Balance:-"+currentBalance);
}
public String displayDetails()
{
	System.out.println("===========================================================================");
	return this.toString();
	
}
@Override
public String toString() {
	return "BankName=" + bankName + "\nbankCustomerName=" + bankCustomerName + "\nbankAddress=" + bankAddress
			+ "\nbankIFSCCode=" + bankIFSCCode + "\ncustomerAccountNumber=" + customerAccountNumber
			+ "\ncurrentBalance=Rs"+currentBalance+"";
}

}



