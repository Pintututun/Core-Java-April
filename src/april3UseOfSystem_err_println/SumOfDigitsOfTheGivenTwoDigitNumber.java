package april3UseOfSystem_err_println;

public class SumOfDigitsOfTheGivenTwoDigitNumber {
public static void main(String [] args)
{
	int number=Integer.parseInt(args[0]);
	if(number>=10&&number<=99)
	{
		int firstDigit=number%10;
		int secondDigit=number/10;
		int sum=firstDigit+secondDigit;
		System.out.println("Sum of Digits="+sum);
	}
	else if(number<0)
		System.err.println("Sum="+(-3));
	else if(number>99)
		System.err.println("Sum="+(-2));
	else System.err.println("Sum="+(-1));
}
}
