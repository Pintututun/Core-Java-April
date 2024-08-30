package credit_card_type_program;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the customer name--");
	String name=sc.nextLine();
	System.out.print("Enter the customer points--");
	int points=sc.nextInt();
	Customer c=new Customer(name,points);
	CardType ct=CardsOnOffer.getOfferedCard(c);
	System.out.println(ct);
	System.out.println(CardsOnOffer.getOfferedCard(c));
	sc.close();
	
}
}
