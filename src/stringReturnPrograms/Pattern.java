package stringReturnPrograms;

public class Pattern {
public static String createBoxPattern(int row,int col)
{   
	String pat=""; 
	if(row<0||col<0)return -1+"";
	else if(row==0||col==0)return -2+"";
	else 
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1||i==row||j==1||j==col)
				{
					pat=pat+"* ";
				}
				else pat=pat+"  ";
			}
			pat=pat+"\n";
		}
		return pat;
	}
}
}
