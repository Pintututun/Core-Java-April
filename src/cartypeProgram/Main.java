package cartypeProgram;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the brand-- ");
	String b=sc.nextLine();
	System.out.print("Enter the model-- ");
	String m=sc.nextLine();
	System.out.print("Enter the year-- ");
	int y=sc.nextInt();
	System.out.print("Enter the driver name--");
	String dname=sc.nextLine();sc.nextLine();
	System.out.print("Enter the driver age--");
	int a=sc.nextInt();sc.nextLine();
	System.out.print("Enter the new driver name--");
	String ndriver=sc.nextLine();
	System.out.print("Enter the new driver age--");
	int nage=sc.nextInt();
	Driver d=new Driver(dname,a);
	Car c=new Car(b,m,y,d);
	Car c1=new Car(c);
	Driver d1=new Driver(ndriver,nage);
	c1.changeDriver(d1);
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println(c);
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println(c1);
	sc.close();

}
}
