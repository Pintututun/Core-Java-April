package cartypeProgram;

public class Driver {
private String name;
private int age;

public Driver(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public Driver(Driver d1)
{
	this.name=d1.name;
	this.age=d1.age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Driver [name=" + name + ", age=" + age + "]";
}

}
