package setA_program2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the radius of circle:");
	int rad=sc.nextInt();
	System.out.print("Enter the length of rectangle:");
	int len=sc.nextInt();
	System.out.print("Enter the breadth of rectangle:");
	int bre=sc.nextInt();
	Circle cir=new Circle(rad);
	Rectangle rec=new Rectangle(len, bre);
	System.out.println("Area of circle:"+cir.areaOfCircle());
	System.out.println("Area of rectangle:"+rec.areaOfRectangle());
}
}
