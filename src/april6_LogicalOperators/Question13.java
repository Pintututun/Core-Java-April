package april6_LogicalOperators;

public class Question13 {
public static void main(String [] args)
{
	boolean x=true;
	int a=0;
	int b=1;
	double c=2D;
	System.out.println(c);
	//a=x?b:c;//Explicit type casting is required
	a=(int)(x?b:c);
	System.out.println(a);
}
}
