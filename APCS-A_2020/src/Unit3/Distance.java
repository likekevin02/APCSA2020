package Unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
		distance = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,x2,y1,y2);
		distance = 0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow((double)(xTwo-xOne), 2) + Math.pow((double)(yTwo-yOne), 2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println("\n\n");
	}
	
	//complete print or the toString

	public String toString()
	{
		System.out.println("\n");
		String theDistance = String.format("%.3f\n", distance);
		return "distance == " +theDistance;
	}
}