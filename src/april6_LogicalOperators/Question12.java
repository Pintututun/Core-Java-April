package april6_LogicalOperators;

public class Question12 {
public static void main(String [] args)
{
	int z=5;
	if(++z>5||++z>6)z++;
	System.out.println(z);
	z=5;
	if(++z>5|++z>6)z++;
	System.out.println(z);
}
}
