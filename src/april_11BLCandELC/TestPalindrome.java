package april_11BLCandELC;

import java.util.Scanner;

public class TestPalindrome {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number--");
	int number=sc.nextInt();
	int check=CheckPalindrome.isPalindrome(number);
	System.out.println(check==1?"Number is Palindrome":check==0?"Number is not Palindrome":check==-1?number==0?"Number is Zero":"Number is negative":"Number is not 3-digit number");
	sc.close();
}
}
