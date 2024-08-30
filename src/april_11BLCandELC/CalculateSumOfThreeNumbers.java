package april_11BLCandELC;

import java.util.Scanner;

public class CalculateSumOfThreeNumbers {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st number--");
	int number1=sc.nextInt();
	System.out.print("Enter 2nd number--");
	int number2=sc.nextInt();
	System.out.print("Enter 3rd number--");
	int number3=sc.nextInt();
	int result=SumOfThreeRoundedNumbers.sumOfRoundedValues(number1, number2, number3);
	System.out.println("Sum after rounding is "+result);
	sc.close();
}
}
