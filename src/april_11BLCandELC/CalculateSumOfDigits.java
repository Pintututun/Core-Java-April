package april_11BLCandELC;
import java.util.Scanner;
public class CalculateSumOfDigits {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number--");
	int number=sc.nextInt();
	int result=SumOfDigits.getSumOfDigits(number);
	System.out.println("Sum of digits-"+result);
	sc.close();
}
}
