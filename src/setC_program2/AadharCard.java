package setC_program2;

import java.util.Scanner;

public class AadharCard {
private String aadharId;

public AadharCard() {
	super();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the aadhar id:");
	this.aadharId=sc.nextLine();
	Person p=new Person(this);
}
public void display()
{
	System.out.println("Aadhar Id:"+aadharId);
}

}
