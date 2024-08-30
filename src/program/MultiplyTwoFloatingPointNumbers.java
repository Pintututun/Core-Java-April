package program;

public class MultiplyTwoFloatingPointNumbers {
public static void main(String [] args)
{
	double number1=Double.parseDouble(args[0]);
	double number2=Double.parseDouble(args[1]);
	double multiplied=number1*number2;
	System.out.println("MULTIPLICATION OF TWO NUMBERS="+ multiplied);
}
}
