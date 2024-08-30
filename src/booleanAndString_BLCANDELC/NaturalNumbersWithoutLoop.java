package booleanAndString_BLCANDELC;

public class NaturalNumbersWithoutLoop {
public static String getNaturalNumbers(int min,int max)
{   
	String natural=" ";
	if(min==0||max==0)return -2+"";
	else if(min<0||max<0)return -1+"";
	else if(min>max)return -3+"";
	else 
	{

		if(min!=max)
		{
			return natural+(min++)+" "+NaturalNumbersWithoutLoop.getNaturalNumbers(min, max);
		}
		else return natural+min;
	}
}
}
