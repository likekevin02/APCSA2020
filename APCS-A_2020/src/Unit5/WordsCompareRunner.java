package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare string1 = new WordsCompare();
		string1.setWords("abe","ape");
		System.out.println(string1);
		
		string1.setWords("giraffe","gorilla");
		System.out.println(string1);
		
		string1.setWords("one","two");
		System.out.println(string1);
		
		string1.setWords("fun","funny");
		System.out.println(string1);
		
		string1.setWords("123","19");
		System.out.println(string1);
		
		string1.setWords("193","1910");
		System.out.println(string1);
		
		string1.setWords("goofy","godfather");
		System.out.println(string1);
		
		string1.setWords("funnel","fun");
		System.out.println(string1);

	}
}