package stringReturnPrograms;

import java.util.Scanner;

public class VacationCheck {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("0--->Sunday");
	System.out.println("1--->Monday");
	System.out.println("2--->Tuesday");
	System.out.println("3--->Wednesday");
	System.out.println("4--->Thursday");
	System.out.println("5--->Friday");
	System.out.println("6--->Saturday");
	System.out.print("Enter the day number--");
	int num=sc.nextInt();
	System.out.println("Are u going in a vacation--");
	System.out.print("Enter true/false");
	boolean go=sc.nextBoolean();
	String result=Vacation.ringAlarm(num,go);
	System.out.println(result);
	
}
}
