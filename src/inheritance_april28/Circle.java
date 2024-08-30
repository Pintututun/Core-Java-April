package inheritance_april28;

public class Circle {
double radius;
public Circle()
{
	System.out.println("No Argument Circle Constructor");
}
public Circle(double radius) {
	super();
	this.radius = radius;
}
public double getArea()
{
	 double pi=3.14;
if(radius>=0)
{
	return pi*radius*radius;
}
else
{
	return -1.0;
}
}


}
