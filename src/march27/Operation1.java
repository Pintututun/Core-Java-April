package march27;
public class Operation1 {
public static void main(String [] x)
{
	
	int v1 =Integer.parseInt(x[0]);
	int v2 =Integer.parseInt(x[1]);
	System.out.println("With comand line aurgument:");
	int c = v1+v2;
	System.out.println("Addition of "+v1+" and "+v2+" = "+c);
	System.out.println("Substraction="+(v1-v2));
	System.out.println("Multiplication="+(v1*v2));
	System.out.println("Division="+(double)(v1/v2));
	System.out.println("Quotient="+(int)(v1/v2));
	System.out.println("Remainder="+(v1%v2));

}
}
