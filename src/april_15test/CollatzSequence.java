package april_15test;

public class CollatzSequence {
public static String getCollatzSequence(int num)
{
	String number="";
	int n2=num-1;
	int n1=(int)Math.pow(2,n2);
	if(n2>0)
	{
	while(n2>=0)
	{
		number=number+n1+" ";
		n2--;
		n1=(int)Math.pow(2, n2);
	}
	return number;
	}
	else return "Error";
}
}
