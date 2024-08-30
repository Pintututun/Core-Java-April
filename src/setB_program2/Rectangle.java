package setB_program2;

public class Rectangle extends Shape {
private int length;

public Rectangle(int length, int breadth) {
	super(breadth);
	this.length = length;
	System.out.println("Area of Rectangle:"+areaOfRectangle());
}
public int areaOfRectangle()
{
	return (length*getData());
}

}
