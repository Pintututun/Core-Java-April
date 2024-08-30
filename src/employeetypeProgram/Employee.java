package employeetypeProgram;

public class Employee {
private String name;
private int age;
private double salary;
private String department;
public Employee(String name, int age, double salary, String department) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.department = department;
}
public Employee(Employee e)
{
	this.name=e.getName();
	this.age=e.getAge();
	this.salary=e.getSalary();
	this.department=e.getDepartment();
}
public double raiseSalary(double per)
{
	return this.salary+(this.salary*(per/100));
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
}

}
