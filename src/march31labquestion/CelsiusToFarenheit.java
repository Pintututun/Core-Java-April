package march31labquestion;

public class CelsiusToFarenheit {
public static void main(String [] args)
{
	float celsius=Float.parseFloat(args[0]);
	float farenheit=((9*celsius)/5)+32;
	System.out.println("Temperature in farenheit="+farenheit);
}
}
