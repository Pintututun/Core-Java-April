package booleanAndString_BLCANDELC;
import java.util.Scanner;
public class TestBoolean {
public static void main(String [] args)
{    
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first boolean value-");
	boolean first=sc.nextBoolean();
	System.out.print("Enter second boolean value-");
	boolean second=sc.nextBoolean();
	System.out.print("Enter third boolean value-");
	boolean third=sc.nextBoolean();
	boolean result=CountingBoolean.countBoolean(first,second,third);
	System.out.println(result);
	sc.close();
}
}
