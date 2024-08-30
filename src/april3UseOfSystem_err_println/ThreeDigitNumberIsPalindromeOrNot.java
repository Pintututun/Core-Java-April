package april3UseOfSystem_err_println;

public class ThreeDigitNumberIsPalindromeOrNot {
public static void main(String [] args)
{
	int number=Integer.parseInt(args[0]);
	int check;
	if(number<=0)
	{
		check=-1;
	}
	else
	{   
		int c=0;
		for(int k=number;k!=0;k/=10)c++;
		if(c==3)
		{   int number1=number;
			int firstDigit=number1/100;
			number1=number1%100;
			int secondDigit=(number1/10)*10;
			int thirdDigit=(number1%10)*100;
			number1=thirdDigit+secondDigit+firstDigit;
			if(number==number1)check=1;
			else check=0;					
		}
		else check=-2;
	}
	if(check==-1)
		System.err.println("Please enter a positive number");
	else if(check==-2)
		System.err.println("Please provide 3-Digit number");
	else if(check==1)
		System.out.println("Number is Palindrome");
	else 
		System.out.println("Number is not Plaindrome");
}
}
