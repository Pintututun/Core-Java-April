package batch19test1;

public class ReverseA3DigitNumber {
public static void main(String [] args)
{
	int number=Integer.parseInt(args[0]);
	int firstDigit=number/100;
	number=number%100;
	int secondDigit=number/10;
	int thirdDigit=number%10;
	System.out.println("Reverse="+thirdDigit+""+secondDigit+""+firstDigit);
}
}
