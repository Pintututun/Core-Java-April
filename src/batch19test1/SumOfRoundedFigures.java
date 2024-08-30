package batch19test1;

public class SumOfRoundedFigures {
public static void main(String [] args)
{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	int d=((a/10)+1)*10;
	int e=((b/10)+1)*10;
	int f=((c/10)+1)*10;
	int sum=d+e+f;
	System.out.println("Sum="+sum);
	
}
}
