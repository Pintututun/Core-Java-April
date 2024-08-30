package has_a_relation_21April;

public class Employee {
private int empId;
private String empName;
private Address address;//Has a relation
public Employee(int empId, String empName, Address address) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.address = address;
}
@Override
public String toString() {
	return "Employee \nEmployeeId=" + empId + "\n EmployeeName=" + empName  + "\n"+address + "";
}

}
