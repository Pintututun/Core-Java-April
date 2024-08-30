package april5_Logical_Increment_Decrement_Operators;

public class Question7_BooleanAnd {
public static void main(String [] args)
{
	int a=20,b=10;
	if((a<b)&(++b<20))// &&->Logical AND,&->Boolean AND
	{
		System.out.println("Logical AND");
	}
	{
		System.out.println("b value is :"+b);
	}
}
}
