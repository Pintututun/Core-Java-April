package booleanAndString_BLCANDELC;

public class PrintNaturalNumbersRange {
public static String getNumbersInRange(int num1,int num2)
{
	if(num2>num1)
	{
		if((num2-num1)>0)
		{   
			String natural=num1+" ";
			for(int i=num1+1;i<=num2;i++)
			{
				natural=natural+i+" ";
			}
			return natural;
		}
		else if((num2-num1)==0)return -2+"";
		else return -1+"";
	}
	else return -3+"";
}
}
