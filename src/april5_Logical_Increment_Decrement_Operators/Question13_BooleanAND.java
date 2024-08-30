package april5_Logical_Increment_Decrement_Operators;

public class Question13_BooleanAND {
public static void main(String [] args)
{
	int i=0;
	boolean t=true;
	boolean f=false,b;
	b=(t&((i++)==0));// expression is checked after increment is done
	b=(f&((i+=2)>0));
	System.out.println(i);
}
}
