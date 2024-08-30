package inheritance;

public class Hosteller extends Student {
double hostelFee;

public Hosteller(int studentId, String name, double examFee, double hostelFee) {
	super(studentId, name, examFee);
	this.hostelFee = hostelFee;
}
public double payFee(double amount)
{
	double totalAmount=amount-(this.hostelFee+super.payFee());
	return totalAmount;
}
public String displayDetails() {
	return toString();
}

@Override
public String toString() {
	return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee=" + examFee
			+ "]";
}


}
