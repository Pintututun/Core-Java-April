package march31labquestion;

public class FarenheitToCelsius {
public static void main(String [] args)
{
	float farenheit=Float.parseFloat(args[0]);
	float celsius=(farenheit-32)*5/9;
	System.out.println("Temperature in celsius="+celsius);
	
	
}
}
