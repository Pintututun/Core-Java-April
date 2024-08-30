package april_11BLCandELC;

public class SumOfThreeRoundedNumbers {
public static int sumOfRoundedValues(int num1,int num2,int num3)
{
	if(num1<=0||num2<=0||num3<=0)return -1;
	else
	{
		int check1=num1%10;
		int round1=num1/10;
		int check2=num2%10;
		int round2=num2/10;
		int check3=num3%10;
		int round3=num3/10;
		if(check1>=5)round1=(round1+1)*10;
		else round1=round1*10;
	    if(check2>=5)round2=(round2+1)*10;
		else round2=round2*10;
	    if(check3>=5)round3=(round3+1)*10;
	    else round3=round3*10;
	    int sum=round1+round2+round3;
	    return sum;
		
	}
}
}
