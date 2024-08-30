package booleanAndString_BLCANDELC;

import java.util.Scanner;

public class PrintingNaturalNumberAsString {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter minimum value--");
	int min=sc.nextInt();
	System.out.println("Enter maximum value--");
	int max=sc.nextInt();
	String result=PrintNaturalNumbersRange.getNumbersInRange(min,max);
	System.out.println(result);
	sc.close();
}
}
