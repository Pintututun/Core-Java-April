package april_15test;
import java.util.Scanner;
public class Collatz_ELC {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number--");
    int num=sc.nextInt();
    String pattern=CollatzSequence.getCollatzSequence(num);
    System.out.println(pattern);
}

}
