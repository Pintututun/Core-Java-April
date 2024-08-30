package labexercises_may1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     System.out.print("Enter the sport u like--");
     String sp=sc.nextLine();
     System.out.print("Enter the number of players of each team-");
     String number=sc.nextLine();
     Soccer so=new Soccer();
     String result=so.getName(sp)+so.getNumberOfTeamMembers(number);
     System.out.println("============================================");
     System.out.println(result);
 
}
}
