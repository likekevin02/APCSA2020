package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		num = number;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 0;
		int i = 1;
		while (i < a && i < b && i <c) {
			if (a%i == 0 && b%i == 0 && c%i == 0) {
				gcf = i;
				i++;
			}
		}
		

		return gcf;
	}
	
	public boolean evens(int a, int b, int c) {
		if ((a%2 == 1 && b%2 == 0) || (a%2 == 0 && b%2 ==1) && c%2 == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean pythagorean(int a, int b, int c) {
		
	}
	

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}