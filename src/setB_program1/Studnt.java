package setB_program1;

import java.util.Scanner;

public class Studnt {
private Integer studentId;
public Studnt()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the student id:");
	this.studentId=sc.nextInt();
	Traier t=new Traier(this);	
}
public void display()
{
	System.out.println("Student Id:"+studentId);
}
}
