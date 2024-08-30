package april_15test;

public class ReturnString {
public static String getFourPerLine(int n)
{
	String number="";
	if(n<=99)
	{
	for(int i=1;i<=n;i++)
	{   
		number=number+i+" ";
		if((i%4)==0)number=number+"\n";
	}
	return number;
	}
	else if(n==0)
	{
		return -2+"";
	}
	else if(n<0)return -1+"";
	else return -3+"";
}
}
