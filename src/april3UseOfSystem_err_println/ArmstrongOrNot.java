package april3UseOfSystem_err_println;

public class ArmstrongOrNot {
public static void main(String [] args)
{
	int number1=Integer.parseInt(args[0]);
	int c=0,r;
	int num2=0;
	for(int m=number1;m!=0;m/=10)c++;
	for( int k=number1;k!=0;k/=10)
	{
		r=k%10;
		num2=num2+(int)Math.pow(r,c);
		
	}
	if(number1==num2)
	{
		System.out.println("Number is armstrong");
	}
	else System.err.println("Number is not armstrong");
}
}
