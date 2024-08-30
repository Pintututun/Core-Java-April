package program;

public class AsciiValueOfaCharacterWithCmd {
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		int alphabet=(int)(ch);
		System.out.println(ch+"="+alphabet);
	}
}
