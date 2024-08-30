package stringReturnPrograms;

public class Pattern2 {
public static String numberPattern4(int row)
{
	String pattern="";
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			int mul=i*j;
			pattern=pattern+mul+" ";
		}
		pattern=pattern+"\n";
	}
	return pattern;
}
}
