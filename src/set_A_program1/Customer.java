package set_A_program1;

public class Customer {
String firstName;
String lastName;
public Customer(Customer cust)
{
	this.firstName=cust.firstName;
	this.lastName=cust.lastName;
}
public Customer(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
