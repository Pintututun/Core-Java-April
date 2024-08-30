package com.nit17_APR.B;

import java.util.Scanner;

public class TrainerDemo_ELC {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	Trainer t=new Trainer();
	System.out.print("Enter the trainer id--");
	int id1=sc.nextInt();String name1=sc.nextLine();
	System.out.print("Enter the trainer name--");
    name1=sc.nextLine();
	System.out.print("Enter the trainer salary--");
	double salary1=sc.nextDouble();
	t.setTrainerData(id1, name1, salary1);
	sc.close();
}
}
