package program;

public class FindASCIIvalue {
public static void main(String [] args)
{
	for(char i='a';i<='z';i++)
	{
		int asciiValue=(int)i;
		System.out.println(i+"="+asciiValue);
	}
}
}
