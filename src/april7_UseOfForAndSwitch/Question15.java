package april7_UseOfForAndSwitch;

public class Question15 {
public static void main(String [] args)
{
	String s="xyz";
	switch(s.length())
	{
	case 1:System.out.println("length is one");
	break;
	case 2:System.out.println("length is two");
	break;
	case 3:System.out.println("length is three");
	break;
	default:System.out.println("no match");
	}
}
}
