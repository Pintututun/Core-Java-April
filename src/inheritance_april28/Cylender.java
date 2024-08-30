package inheritance_april28;

public class Cylender extends Circle {
double height;
double rdius;
public Cylender()
{
	System.out.println("No Argument Cylender constuctor");
}
public Cylender(double radius,double height,double rdius) {
	super(radius);
	this.height = height;
	this.rdius=rdius;
}
public double getVolume()
{
	if(height>=0||rdius>=0)
	{
	final double pi=3.14;
	double volume=pi*rdius*rdius*height;
	return volume;
	}
	else
		return -1.0;
}
}

