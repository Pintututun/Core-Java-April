package inheritance_april28;

import java.util.Scanner;

public class ShapeTester {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the radius of circle--");
	double rcircle=sc.nextDouble();
	System.out.print("Enter the radius of cylinder--");
	double rcylender=sc.nextDouble();
	System.out.print("Enter the height of cylinder--");
	double hcylender=sc.nextDouble();
	Cylender cy=new Cylender();
	Cylender ct=new Cylender(rcircle,rcylender,hcylender);
	System.out.println(cy.getArea());
    System.out.println(cy.getVolume());
    System.out.println(ct.getArea());
    System.out.println(ct.getVolume());
	
}
}
