package stringReturnPrograms;

public class Vacation {
public static String ringAlarm(int day,boolean check)
{
	if(day>=1&&day<=5)
	{
		if(check==true)
		{
			return "10:00";
		}
		else return "07:00";
		
	}
	else if(day==0||day==6)
	{
		if(check==true)return "OFF";
		else return "10:00";
	}
	else return "Invalid Inputs";
}
}
