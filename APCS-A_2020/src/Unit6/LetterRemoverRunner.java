package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover bruh = new LetterRemover();
		bruh.setRemover("I am Sam I am", 'a');
		System.out.println(bruh);
		bruh.removeLetters();
		
											
	}
}