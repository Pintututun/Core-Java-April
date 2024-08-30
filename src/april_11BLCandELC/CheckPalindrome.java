package april_11BLCandELC;

public class CheckPalindrome {
public static int isPalindrome(int n)
{   
	if(n>0)
	{
		int c=0,rev=0;
	for(int i=n;i>0;i/=10)c++;
	if(c==3)
	{
		for(int k=n;k>0;k/=10)
			rev=rev*10+k%10;
		if(rev==n)return 1;
		else return 0;
		
	}
	else return -2;
	
	}
	else return -1;
	
}
}
