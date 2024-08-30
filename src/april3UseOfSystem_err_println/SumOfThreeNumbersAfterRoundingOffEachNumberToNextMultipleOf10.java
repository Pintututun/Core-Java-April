package april3UseOfSystem_err_println;

public class SumOfThreeNumbersAfterRoundingOffEachNumberToNextMultipleOf10 {
public static void main(String [] args)
{
	int number1=Integer.parseInt(args[0]);
	int number2=Integer.parseInt(args[1]);
	int number3=Integer.parseInt(args[2]);
	int check=0;
	if(number1<0||number2<0||number3<0)
	check=-1;
	else if(number1==0||number2==0||number3==0)
		check=-2;
	else
	{
		check=0;
		int nextMultiple1=((number1/10)+1)*10;
		int nextMultiple2=((number2/10)+1)*10;
		int nextMultiple3=((number3/10)+1)*10;
		int sum=nextMultiple1+nextMultiple2+nextMultiple3;
		System.out.println("Sum is "+sum);
	}
	if(check==-1)
		System.err.println("Given Number is negative Please provide a Positive number");
	else if(check==-2)
		System.err.println("Don't pass value as 0");
	else
		System.out.println("Thank u");
	
		
}
}
