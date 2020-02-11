package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		String vowels = "aeiouAEIOU";
		if (vowels.contains(a.substring(0,1)) || vowels.contains(a.substring(a.length()-1))) {
			return "yes";
		} else {
			return "no";
		}
	}
}