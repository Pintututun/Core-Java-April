package april3UseOfSystem_err_println;

public class PrintTheNumberItself_ifEvenNumberAndIfOddThenReturnNextMultiple {
public static void main(String [] args)
{
	int number=Integer.parseInt(args[0]);
	int check=0,nextMultiple;
	if(number==0)
		check=-2;
	else if(number<0)
		check=-1;
	else
	{
		check=0;
		if(number%2==0)
			System.out.println(number);
		else
		{
		  nextMultiple=((number/10)+1)*10;
		  System.out.println("Next multiple of"+number+"is"+nextMultiple);
		}
	}
	if(check==-2)System.err.println("Given number is negative Please provide positive number");
	else if(check==-1)System.err.println("Don't pass value as 0");
	else System.out.println("Thank u");
}
}
