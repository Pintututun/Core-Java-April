package binaryoctalhexadecimal;

public class Binary {
public static void main(String [] args)
{
int number=Integer.parseInt(args[0]);
String s=Integer.toBinaryString(number);
System.out.println("Binary Number of "+ number+ " is "+s);

}
}
