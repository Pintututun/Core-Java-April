package credit_card_type_program;

public class Customer {
private String customerName;
private int creditPoints;
public Customer(String Name, int Points) {
	super();
	this.customerName = Name;
	this.creditPoints = Points;
}

public int getCreditPoints() {
	return creditPoints;
}
@Override
public String toString() {
	return "The Customer " + customerName + "";
}

}
