package com.nit.method_april10;
import java.util.Scanner;
public class Test1 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the length--");
	    double num1=sc.nextDouble();
	    System.out.print("Enter the breadth--");
	    double num2=sc.nextDouble();
	    double area=Rectangle.getArea(num1, num2);
	    System.out.println("Area=="+area);
	    sc.close();
	}

}
