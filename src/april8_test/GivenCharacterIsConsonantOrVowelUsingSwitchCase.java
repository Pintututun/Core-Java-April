package april8_test;

public class GivenCharacterIsConsonantOrVowelUsingSwitchCase {
public static void main(String [] args)
{
	char character=args[0].charAt(0);
	int number=character;
	int number1=number;
	if(character>=65&&character<=90)
	{
		number1=number1+32;
		character=(char)number1;
	}
	switch(character)
	{
	case 'a':
	System.out.println("Vowel and unicode value="+number);
	break;
	case 'e':
	System.out.println("Vowel and unicode value="+number);
	break;
	case 'i':
		System.out.println("Vowel and unicode value="+number);
		break;
	case 'o':
		System.out.println("Vowel and unicode value="+number);
		break;
	case 'u':
		System.out.println("Vowel and unicode value="+number);
		break;
	default:
		System.out.println("Consonant and unicode value="+number);
	}
	
}
}
