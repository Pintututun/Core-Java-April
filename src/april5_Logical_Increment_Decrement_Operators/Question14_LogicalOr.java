package april5_Logical_Increment_Decrement_Operators;

public class Question14_LogicalOr {
public static void main(String [] args)
{
	int i=0;
	boolean t=true;
	boolean f=false,b;
	b=(t||((i++)==0));
	System.out.println(b);
	System.out.println(i);
	b=(f||((i+=2)>0));
	System.out.println(b);
	System.out.println(i);
}
}
