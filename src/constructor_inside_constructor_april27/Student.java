package constructor_inside_constructor_april27;

public class Student {
	private String name;
private int age;
private double GPA;
private Teacher teacher;
public Student(String name,int age,double GPA,Teacher teacher)
{
	super();
	this.name=name;
	this.age=age;
	this.GPA=GPA;
	this.teacher=teacher;
}
public Student(Student t)
{
	this.name=t.name;
	this.age=t.age;
	this.GPA=t.GPA;
	this.teacher=t.teacher;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getGPA() {
	return GPA;
}
public void setGPA(double gPA) {
	GPA = gPA;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
public void changeTeacher(Teacher newTeacher)
{
	this.teacher=new Teacher(newTeacher);
}
@Override
public String toString() {
	return "Student [age=" + age + ", GPA=" + GPA + "]";
}


}
