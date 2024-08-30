package usingObjectPrograms;
import java.util.Scanner;
public class Player {
 int playerNumber;
 String playerName;
 String playerOrigin;
 char gender;
 int age;
 String playerSkill;
 int matchesPlayed;
 String priceOfPlayer;
 public void displayPlayerProperties()
 {
	 System.out.println("The player name is "+playerName);
	 System.out.println("The player number is "+playerNumber);
	 System.out.println("The player origin is "+playerOrigin);
	 System.out.println("The player gender is "+gender);
	 System.out.println("The player age is "+age);
	 System.out.println("The player skill is "+playerSkill);
	 System.out.println("The matches played is "+matchesPlayed);
	 System.out.println("The player price is "+priceOfPlayer);
 }
 public static void main(String [] args)
 {
	 Scanner sc=new Scanner(System.in);
	 Player obj=new Player();
	 System.out.println("Enter the player name--");
	 obj.playerName=sc.nextLine();
	 System.out.println("Enter the player number--");
	 obj.playerNumber=sc.nextInt();
	 System.out.println("Enter player origin--");
	 obj.playerOrigin=sc.next();
	 System.out.println("Enter the gender in [M/F]--");
	 obj.gender=sc.next().charAt(0);
	 System.out.println("Enter the age--");
	 obj.age=sc.nextInt();obj.playerSkill=sc.nextLine();
	 System.out.println("Enter player skill--");
	 obj.playerSkill=sc.nextLine();
	 System.out.println("Enter the matches played--");
	 obj.matchesPlayed=sc.nextInt();
	 System.out.println("Enter the price of player--");
	 obj.priceOfPlayer=sc.nextLine();
	 obj.displayPlayerProperties();
	 sc.close();
 }
 
}
