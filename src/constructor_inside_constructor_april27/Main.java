package constructor_inside_constructor_april27;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	System.out.print("Enter school name :");
	String scName=sca.nextLine();
	System.out.print("Enter school location :");
	String location=sca.nextLine();
	System.out.print("Enter student name :");
	String stName=sca.nextLine();
	System.out.print("Enter age of student :");
	int age=sca.nextInt();
	System.out.print("Enter student GPA :");
	double cGPA=sca.nextDouble();sca.nextLine();
	System.out.print("Enter Teacher name :");
	String tName=sca.nextLine();
	System.out.print("Enter teacher subjects: ");
	String subject=sca.nextLine();
	System.out.print("Enter principal name :");
	String pName=sca.nextLine();
	System.out.print("Enter principal Experience  :");
	int experience=sca.nextInt();
	Principal pr=new Principal(pName,experience);
	Teacher tea=new Teacher(tName,subject);
	Student stu=new Student(stName,age,cGPA,tea);
	School sch=new School(scName,location,stu,pr);
	School sch1=new School(sch);
	Teacher tea1=new Teacher("Govind","English");
	Student stu1=new Student("Priyabrata",24,8.4,tea1);
	stu1.changeTeacher(tea1);
	sch.addStudent(stu1);
	System.out.print("---------------------------------------------------------");
	System.out.println(sch1);
	System.out.print("Enter school name :");
	System.out.print("----------------------------------------------------------");
	System.out.print(sch);
	sca.close();
	
}
}
