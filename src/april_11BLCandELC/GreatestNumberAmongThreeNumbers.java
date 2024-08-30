package april_11BLCandELC;

public class GreatestNumberAmongThreeNumbers {
public static int getGreatest(int num1,int num2,int num3)
{
	if(num1<0||num2<0||num3<0)return -1;
	else if(num1==0||num2==0||num3==0)return -2;
	else
	{
		if(num1>num2&&num1>num3)return num1;
		else if(num2>num1&&num2>num3)return num2;
		else return num3;
	}
}

}
