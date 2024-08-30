package detailsOfBatsman;

import java.util.Scanner;

public class BatsmanMainClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the batsman name--");
	String name=sc.nextLine();
	System.out.print("Enter the batsman runs--");
	int runs=sc.nextInt();
	System.out.print("Enter the batsman matches--");
	int matches=sc.nextInt();
	Batsman obj=new Batsman();
	obj.setDetails(name, runs, matches);
	sc.close();
}

}
