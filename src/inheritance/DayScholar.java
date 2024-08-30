package inheritance;

public class DayScholar extends Student {
double transportFee;

public DayScholar(int studentId, String name, double examFee, double transportFee) {
	super(studentId, name, examFee);
	this.transportFee = transportFee;
}
public double payFee(double amount)
{
	double totalFee=amount-(this.transportFee+super.payFee()) ;
	return totalFee;
}


public String displayDetails() {
	return toString();
}
@Override
public String toString() {
	return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
			+ examFee + "]";
}


}
