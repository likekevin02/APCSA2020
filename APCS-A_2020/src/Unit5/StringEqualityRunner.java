package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality string1 = new StringEquality();
		string1.setWords("hello", "goodbye");
		System.out.println(string1);
		
		string1.setWords("one", "two");
		System.out.println(string1);
		
		string1.setWords("three", "four");
		System.out.println(string1);
		
		string1.setWords("TCEA", "UIL");
		System.out.println(string1);
		
		string1.setWords("State", "Champions");
		System.out.println(string1);
		
		string1.setWords("ABC", "ABC");
		System.out.println(string1);

		string1.setWords("ABC", "CBA");
		System.out.println(string1);
		
		string1.setWords("Same", "Same");
		System.out.println(string1);
		
		
		
	}
}