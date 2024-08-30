package april8_test;
import java.util.*;
public class GivenNumberOfSecondsToMinutes_HoursOrDays {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a time in seconds--");
	int time=sc.nextInt();
	int time1;
	int minutes=0,seconds=0,hours=0;
	if(time<3600)
	{
		time1=1;
	}
	else
		time1=2;
	switch(time1)
	{
	case 1: minutes=time/60;
	 seconds=time%60;
	System.out.println("Time is"+minutes+"mins"+seconds+"secs");
	break;
	case 2:
		 hours=time/3600;
	int check=time%3600;
	if(check>=60)
	{
		minutes=check/60;
		seconds=check%60;
	}
	System.out.println("Time is"+hours+"hrs"+minutes+"mins"+seconds+"secs");
	
	}
	
}
}
