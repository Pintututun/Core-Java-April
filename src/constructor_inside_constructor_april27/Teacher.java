package constructor_inside_constructor_april27;

public class Teacher {
private String name;
private String subject;
public Teacher(String name,String subject)
{
	super();
	this.name=name;
	this.subject=subject;
}
public Teacher(Teacher te)
{
	this.name=te.name;
	this.subject=te.subject;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "Teacher [name=" + name + ", subject=" + subject + "]";
}


}
