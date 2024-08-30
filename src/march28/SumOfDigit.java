package march28;

public class SumOfDigit {
public static void main(String [] args)
{
	int number1=Integer.parseInt(args[0]);
	int seconddigit=number1%10;
	int firstdigit=number1/10;
	int sum=firstdigit+seconddigit;
	System.out.println("Sum of digits--"+sum);
	
			
}
}
