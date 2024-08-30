package com.nit.method_april10;

import java.util.Scanner;

	public class Test{
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a number--");
			int num=sc.nextInt();
			int res=Calculate.squareAndCube(num);
			System.out.println(num<=0?"Value":num%2==0?"Even":"Odd");
			System.out.println(res);
			sc.close();
		}
	}
