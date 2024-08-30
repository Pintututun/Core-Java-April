package inheritance;

public class Student {
int studentId;
String name;
double examFee;
public Student(int studentId, String name, double examFee) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.examFee = examFee;
}
public double payFee()
{
	return this.examFee;
}

public String displayDetails() {
return toString();
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
}


}
