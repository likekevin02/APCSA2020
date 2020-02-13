package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		System.out.println(test);
		System.out.println(test.removeLetters() + "\n");
		
		LetterRemover test1 = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test1);
		System.out.println(test1.removeLetters() + "\n");
		
		LetterRemover test2 = new LetterRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test2);
		System.out.println(test2.removeLetters() + "\n");
		
		LetterRemover test3 = new LetterRemover("abababababa", 'b');
		System.out.println(test3);
		System.out.println(test3.removeLetters() + "\n");
		
		LetterRemover test4 = new LetterRemover("abaababababa", 'x');
		System.out.println(test4);
		System.out.println(test4.removeLetters() + "\n");
		
											
	}
}