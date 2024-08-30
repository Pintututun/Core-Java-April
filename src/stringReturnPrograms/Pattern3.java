package stringReturnPrograms;

public class Pattern3 {
public static String numberPattern4(int row)
{
	String pattern="";
	for(int i=1;i<=row;i++)
	{
		for(int j=i;j<=(2*i-1);j++)
		{
			pattern=pattern+j+" ";
		}
		pattern=pattern+"\n";
	}
	return pattern;
	
			
}
}
