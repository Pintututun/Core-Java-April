package march31labquestion;

public class CompoundInterest {
public static void main(String [] args)
{
	int time=Integer.parseInt(args[0]);
	double rate=Double.parseDouble(args[1]);
	double principal=Double.parseDouble(args[2]);
	double inside=1+(rate/100);
	double amount=principal*Math.pow(inside,time);
	double compoundInterest=amount-principal;
	System.out.println("Amount="+amount+" And Compound Interest="+compoundInterest);
}
}
