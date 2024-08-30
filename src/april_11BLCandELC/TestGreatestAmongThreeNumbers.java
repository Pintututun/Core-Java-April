package april_11BLCandELC;

import java.util.Scanner;

public class TestGreatestAmongThreeNumbers {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st number--");
	int number1=sc.nextInt();
	System.out.print("Enter 2nd number--");
	int number2=sc.nextInt();
	System.out.print("Enter 3rd number--");
	int number3=sc.nextInt();
	int result=GreatestNumberAmongThreeNumbers.getGreatest(number1, number2, number3);
	if(result==-2)System.out.println("All numbers should greater than zero");
	else if(result==-1)System.out.println("All numbers should be positive");
	else
	System.out.println(result+" is greatest");
	sc.close();
}
}
