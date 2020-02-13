package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("hi",'a');
	}

	public LetterRemover(String s, char rem) {
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		while (cleaned.indexOf(lookFor) >= 0) {
			int index = cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0,index) + cleaned.substring(index + 1);
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
		
	}
}