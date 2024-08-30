package setA_program2;

public class Rectangle extends Shape{
private int length;
public Rectangle(int length,int breadth) {
	super(breadth);
	this.length = length;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public double areaOfRectangle()
{
	double area=length*getData();
	return area;
}

}
