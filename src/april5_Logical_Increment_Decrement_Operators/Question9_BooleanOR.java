package april5_Logical_Increment_Decrement_Operators;

public class Question9_BooleanOR {
public static void main(String [] args)
{
	int z=5;
	if(++z>5|++z>6)
	{
		z++;
	}
	System.out.println(z);
}
}
