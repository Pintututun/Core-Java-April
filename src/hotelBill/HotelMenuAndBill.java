package hotelBill;
import java.util.Scanner;
public class HotelMenuAndBill {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String check="";
	do {
	System.out.println("-------------------------------------------------------------");
	System.out.println("---------------------------MENU------------------------------");
	System.out.println("\t\tCoffee [C\\c]           --Rs 10");
	System.out.println("\t\tTea [T\t]              --Rs 10 ");
	System.out.println("\t\tDosa  [D\\d]            --Rs 15 ");
	System.out.println("\t\tPuri  [P\\p]            --Rs 30 ");
	System.out.println("\t\tBiriyani [B\\b]         --Rs 90");
	System.out.println("\t\tChicken Chaowmin [C\\c] --Rs80");
	System.out.print("Enter your option For Switch -->");
	char opt=sc.next().charAt(0);
	double amount=0.0;
	switch(opt)
	{
	case 'C': case 'c':System.out.println("Do want to continue Press[Y\\y]");
	check=sc.next();
	}
	}while(check.equalsIgnoreCase("Y"));
		System.out.println("Thank you..visit again..");
	
	
}
}
