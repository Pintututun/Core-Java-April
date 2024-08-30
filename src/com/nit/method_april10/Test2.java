package com.nit.method_april10;

import java.util.Scanner;

public class Test2 {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a integer--");
	int num=sc.nextInt();
	boolean check=EvenOrOdd.isEven(num);
	if(check==true)System.out.println("Even number");
	else System.out.println("Odd number");
	sc.close();
}
}
