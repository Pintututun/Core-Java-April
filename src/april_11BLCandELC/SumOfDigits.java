package april_11BLCandELC;

public class SumOfDigits {
	public static int getSumOfDigits(int n)
	{
		if(n<0)return -3;
		else if(n>=0&&n<=9)return -1;
		else if(n>=10&&n<=99)
		{   int sum=0;
			for(int i=n;i>0;i/=10)sum=sum+i%10;
			return sum;
		}
		else return -2;
	}

}
