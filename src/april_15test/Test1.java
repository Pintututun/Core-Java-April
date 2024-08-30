package april_15test;
import java.util.*;
public class Test1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number are : ");
		int num = sc.nextInt();
		String result = ArmStrongNumber.getArmStrong(num);
		System.out.println(result);
		sc.close();
	}

}
