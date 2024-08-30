package april_15test;
import java.util.Scanner;
public class ReturnString_ELC {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number below 99--");
	int num=sc.nextInt();
	String pattern=ReturnString.getFourPerLine(num);
	System.out.println(pattern);
}
}
