package april7_UseOfForAndSwitch;

public class Question10 {
public static void main(String [] args)
{
	short x=200;
	switch(x)
	{
	case 100:System.out.println("One hundred");
	break;
	case 200:System.out.println("Two hundred");
	break;
	//case 33000:System.out.println("Thirty thousand");
	//break;
	case -32768:System.out.println("minus Thirty two thousand seven hundred sixty eight");
	break;
	case 32767:System.out.println("Thirty two thousand seven hundred sixty seven");
	break;
	}
}
}
