package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double big = one;
		if (two > one && two > three && two > four) {
			big = two;
		} else if (three > one && three > two && three > four) {
			big = three;
		} else if (four > one){
			big = four;
		}
		
		return big;
	}

	public String toString()
	{
		return one + " " + two + " " + three + " " + four + "\n" + "Biggest = " + getBiggest();
	}
}