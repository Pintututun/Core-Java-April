package april4_Operator;

public class CountingPalindromeNumbers {
public static void main(String [] args)
{
     int c=0;
	for(int i=10;i<=99;i++)
	{
		for(int j=10;j<=i;j++)
		{
			int product=i*j;
			int rev=0;
			for(int k=product;k!=0;k/=10)rev=rev*10+k%10;
			if(product==rev)
			{
				System.out.println(product);
				c++;
			}
   		}
	}
	System.out.println(c);
}
}
