package setA_program2;

public class Circle extends Shape {
final double PI=3.14;
public Circle(int radius)
{
	super(radius);
}
public double areaOfCircle()
{
	double area=PI*(getData()*getData());
	return area;
}
}
