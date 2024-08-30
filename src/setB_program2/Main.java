package setB_program2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the side of a square:");
	int side=sc.nextInt();
	System.out.print("Enter the length of rectangle:");
	int length=sc.nextInt();
	System.out.print("Enter the breadth of rectangle:");
	int breadth=sc.nextInt();
	Square sq=new Square(side);
	Rectangle rec=new Rectangle(length,breadth);
	sc.close();
	
}
}
