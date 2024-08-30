package detailsOfStudent;

public class Student {
int studentId;
String studentName;
int marks;
char grade;
public void setStudentData(int id,String name,int numbers)
{
	this.studentId=id;
	this.studentName=name;
	this.marks=numbers;
	this.calculateGrade();
}
public void calculateGrade()
{
	if(marks>=90)
		grade='A';
	else if(marks>=81&&marks<90)
		grade='B';
	else if(marks>=71&&marks<81)
		grade='C';
	else if(marks>=61&&marks<71)
		grade='D';
	else 
		grade='E';
}
public String displayDetails()
{
	System.out.println("===============================>STUDENT DETAIL'S<============================");
	return "[Student name= "+studentName+", StudentId= "+studentId+", Marks= "+marks+", Grade= "+grade+"]";
}
}
