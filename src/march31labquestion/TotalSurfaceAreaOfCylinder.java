package march31labquestion;

public class TotalSurfaceAreaOfCylinder {
public static void main(String [] args)
{
    final double PI=3.14;
	double radius=Double.parseDouble(args[0]);
	double height=Double.parseDouble(args[1]);
	double totalSurfaceArea=2*PI*Math.pow(radius,2)+2*PI*radius*height;
	System.out.println("Total Surface Area OF Cylinder="+totalSurfaceArea);
}
}
