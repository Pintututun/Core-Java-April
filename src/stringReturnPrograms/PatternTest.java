package stringReturnPrograms;

import java.util.Scanner;

public class PatternTest {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of rows--");
	int rows=sc.nextInt();
	System.out.print("Enter number of columns--");
	int columns=sc.nextInt();
	String result=Pattern.createBoxPattern(rows, columns);
	System.out.println(result);
	sc.close();
}
}
