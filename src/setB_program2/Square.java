package setB_program2;

public class Square extends Shape {
public Square(int side)
{
	super(side);
	System.out.println("Area of Square:"+areaOfSquare());
}
public int areaOfSquare()
{
	return (getData()*getData());
}
}
