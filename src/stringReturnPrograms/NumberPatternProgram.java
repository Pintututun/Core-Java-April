package stringReturnPrograms;
import java.util.Scanner;
public class NumberPatternProgram {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows--");
	int row=sc.nextInt();
	String result=Pattern2.numberPattern4(row);
	System.out.println(result);
	sc.close();
}
}
