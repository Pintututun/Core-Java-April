package april7_UseOfForAndSwitch;

public class Question3 {
public static void main(String [] args)
{
	for(int i=0;i<=3;i++)
	{
		switch(i)
		{
			case 0:
				System.out.println("i is 0");
			    break;
			case 1:
				System.out.println("i is 1");
			    break;
			case 2:
				System.out.println("i is 2");
			    break;
			default:System.out.println("i is greater than 2");
		}
	}
}
}
