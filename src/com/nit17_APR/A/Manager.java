package com.nit17_APR.A;

public class Manager {
	int managerId;
	String managerName;
	float managerSalary;
	long managerMobileNumber;
	public void setManagerData(int id,String name,float salary,long mobile)
	{
		managerId=id;
		managerName=name;
		managerSalary=salary;
		managerMobileNumber=mobile;
		//this.getManagerData();
	}
	public void getManagerData()
	{
		System.out.println("Manager Id--"+managerId);
		System.out.println("Manager Name--"+managerName);
		System.out.println("Manager salary--"+managerSalary);
		System.out.println("Manager Mobile Number--"+managerMobileNumber);
	}
}
