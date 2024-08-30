package com.nit17_APR.B;

public class Trainer {
int trainerId;
String trainerName;
double trainerSalary;
public void setTrainerData(int id,String name,double salary)
{
	trainerId=id;
	trainerName=name;
	trainerSalary=salary;
	this.getTrainerData();
}
public void getTrainerData()
{
	System.out.println("The trainer id--"+trainerId);
	System.out.println("The trainer name--"+trainerName);
	System.out.println("The trainer salary--"+trainerSalary);
	System.out.println("THANK U");
	
}
}
