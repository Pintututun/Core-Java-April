package labexercises_may1_part2;

import java.util.Scanner;

public class Student {
private int studentId;
public Student()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the student id--");
	studentId=sc.nextInt();
	Trainer t=new Trainer(this);
}
public void display()
{
	System.out.println("Student Id :"+studentId);

}

}
