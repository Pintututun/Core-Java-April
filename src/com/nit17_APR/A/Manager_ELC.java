package com.nit17_APR.A;

import java.util.Scanner;

public class Manager_ELC {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	Manager man=new Manager();
	System.out.print("Enter manager id--");
	int id1=sc.nextInt();String name1=sc.nextLine();
	System.out.print("Enter manager name--");
    name1=sc.nextLine();
	System.out.print("Enter manager salary--");
	float salary1=sc.nextFloat();
	System.out.print("Enter manager mobile number--");
	long mobile1=sc.nextLong();
	man.setManagerData(id1,name1, salary1, mobile1);
	man.getManagerData();
	sc.close();
	
	
}
}
