package march27;

public class Swap {
	public static void main(String [] x)
	{
		int v1=Integer.parseInt(x[0]);
		int v2=Integer.parseInt(x[1]);
		v1=v1+v2;
		v2=v1-v2;
		v1=v1-v2;
		System.out.println("After Swaping--");
		System.out.println(v1);
		System.out.println(v2);
		
	}

}
