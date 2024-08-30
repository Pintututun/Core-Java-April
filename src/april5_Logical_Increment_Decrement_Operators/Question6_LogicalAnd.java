package april5_Logical_Increment_Decrement_Operators;

public class Question6_LogicalAnd {
public static void main(String [] args)
{
	int a=20,b=10;
	if((a<b)&&(++b<20))
	{
		System.out.println("Logical AND");
	}
	else
	{
		System.out.println("b value is:"+b);
	}
}
}
