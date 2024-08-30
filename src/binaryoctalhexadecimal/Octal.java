package binaryoctalhexadecimal;

public class Octal {
public static void main(String [] args)
{
	int number=Integer.parseInt(args[0]);
	String s=Integer.toOctalString(number);
	System.out.println("Octal Value of "+number+" is "+s);
	
}
}
