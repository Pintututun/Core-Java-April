package april7_UseOfForAndSwitch;

import java.util.*;

public class PrintTableOfTheGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print the table-");
		int number = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
				System.out.println(number+"*"+i+"="+i * number);
		}
		sc.close();
	}
}
