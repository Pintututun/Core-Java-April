package april_15test;

public class ArmStrongNumber 
{
	public static String getArmStrong(int num)
	{
		double sum = 0;
		int count = 0;
		int num1 = num;
		if(num<0)
			return "-1";
		else if(num==0)
			return "-2";
		else if (num<1000 || num>9999)
			return "-3";
		else
		{
		for(; num!=0;num/=10)
		{
			int r = num%10;
			count++;
		}
		num = num1;
		for(; num!=0;num/=10) 
		{
			sum = sum+Math.pow(num%10,count);
		}
		if(sum==num1)
		{
			return "ArmStrong Number";
		}
		else
		{
			return "Not ArmStrong NUmber";
		}
		}
		
	}

}
