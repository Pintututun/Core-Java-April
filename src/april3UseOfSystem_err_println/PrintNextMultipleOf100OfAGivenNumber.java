package april3UseOfSystem_err_println;

public class PrintNextMultipleOf100OfAGivenNumber {
public static void main(String [] args)
{
	int number=Integer.parseInt(args[0]);
	if(number<=0)
		System.err.println("-1");
	else
	{
		int nextMultiple=((number/100)+1)*100;
		System.out.println("Next multiple is"+nextMultiple);
	}
}
}
