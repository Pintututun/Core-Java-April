package april4_Operator;

public class Question5 {

	static int operate(int a,int b)
	{
		return (a*b);
	}
	static float operate(float a,float b)
	{
		System.out.println("invoked");
		return (a/b);
	}
	public static void main(String [] args)
	{
		int x=11,y=23;
		float n=9,m=4;
		System.out.print(operate(x,y)+"\t");
		System.out.println(operate(n,m));
	}
}

