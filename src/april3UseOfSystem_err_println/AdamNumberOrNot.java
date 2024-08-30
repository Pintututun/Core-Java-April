package april3UseOfSystem_err_println;

public class AdamNumberOrNot {
public static void main(String [] args)
{
	int number1=Integer.parseInt(args[0]);
	int squarenumber1;
	int squarenumber2;
	int rev=0;
	int rev2=0;
	for(int m=number1;m!=0;m/=10)rev=rev*10+m%10;
	squarenumber1=(int)Math.pow(number1,2);
	squarenumber2=(int)Math.pow(rev,2);
	for(int k=squarenumber2;k!=0;k/=10)rev2=rev2*10+k%10;
	if(rev2==squarenumber1)
	{
		System.out.println("Number is Adam");
	}
	else System.err.println("Number is not Adam");
}
}
