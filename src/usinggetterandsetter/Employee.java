package usinggetterandsetter;

public class Employee {
private int employeeNumber;
private String employeeName;
private double employeeSalary;
public Employee(int num,String name,double salary)
{
	employeeNumber=num;
	employeeName=name;
	employeeSalary=salary;
}
public int getemployeeNumber()
{    
     return employeeNumber;
}
public String getemployeeName()
{
	return employeeName;
}
public double getemployeeSalary()
{
	return employeeSalary;
}

}