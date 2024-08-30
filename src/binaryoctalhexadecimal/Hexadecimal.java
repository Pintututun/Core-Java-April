package binaryoctalhexadecimal;

public class Hexadecimal {
public static void main(String [] args)
{
	int number=Integer.parseInt(args[0]);
	String s=Integer.toHexString(number);
	System.out.println("Hexadecimal Value of "+number+" is"+s);
}
}
