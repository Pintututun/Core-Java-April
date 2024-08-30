package booleanAndString_BLCANDELC;
import java.util.Scanner;
public class NaturalNumbers {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the minimum value--");
	int num1=sc.nextInt();
	System.out.print("Enter the maximum value--");
	int num2=sc.nextInt();
	String result=NaturalNumbersWithoutLoop.getNaturalNumbers(num1,num2);
	System.out.println(result);
	sc.close();
	
}
}
