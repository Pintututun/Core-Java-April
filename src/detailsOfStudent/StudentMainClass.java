package detailsOfStudent;

import java.util.Scanner;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student id--");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Student name--");
		String name=sc.nextLine();
		System.out.print("Enter the Student marks--");
		int num=sc.nextInt();
        Student obj=new Student();
        obj.setStudentData(id, name, num);
        String details= obj.displayDetails();
        System.out.println(details);
        sc.close();
		

	}

}
