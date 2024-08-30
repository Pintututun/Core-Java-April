package inheritance_homework;
//Parent class
class Parent {
	Parent(){
	this(3);//calling parameterized constructor of same class from non parameterized constructor
	System.out.println("Parent class no argument constructor");
}
	Parent(int x)
{
	System.out.println("Parent class integer argument constructor with value x="+x);
}
}
//Child Class
class Child extends Parent{
	Child(){
		this("NIT");//calling parameterized constructor of same class from non-parameterized constructor
		System.out.println("Child class no argument constructor");
	}
	Child(String s)
	{
		System.out.println("Child class String argument constructor with value s="+s);
	}	
}
//ELC Class
public class Main{
	public static void main(String [] args)
	{
		new Child();
	}
}

