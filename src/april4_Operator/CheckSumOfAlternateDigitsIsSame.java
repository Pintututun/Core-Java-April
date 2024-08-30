package april4_Operator;
import java.util.*;
public class CheckSumOfAlternateDigitsIsSame {
public static void main(String [] args)
{   
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number--");
	String number1=sc.next();
	int number2=Integer.parseInt(args[0]);
	int c=0,rev=0;
	for(int i=number2;i!=0;i/=10)
		 c++;
	int digitEven=0,digitOdd=0;
	for(int i=0;i<c;i++)
	{ 
		if(i%2==0)
		{
	      char ch=number1.charAt(i);
	      int digit=ch-48;
	      digitEven=digitEven+digit;
		}
		else
		{
			char ch=number1.charAt(i);
			int digit=ch-48;
			digitOdd=digitOdd+digit;
		}
			
	}
	if(digitEven==digitOdd)
		System.out.println("True");
		else
			System.err.println("False");
}
}
