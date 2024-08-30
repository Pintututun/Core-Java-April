package constructor_inside_constructor_april27;

public class School {
private String name;
private String location;
private Student student;
private Principal principal;
public School(String name,String location,Student student,Principal principal)
{
	super();
	this.name=name;
	this.location=location;
	this.student=student;
	this.principal=principal;
}
public School(School sc)
{
	this.name=name;
	this.location=location;
	this.student=student;
	this.principal=principal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Principal getPrincipal() {
	return principal;
}
public void setPrincipal(Principal principal) {
	this.principal = principal;
}
public void addStudent(Student newStudent)
{
	this.student=new Student(newStudent);
}
@Override
public String toString() {
	return "School [name=" + name + ", location=" + location + "]";
}


}
