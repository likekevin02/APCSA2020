package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static int go(List<Integer> numArray)
	{
		int odd = 0;
		int even = 0;
		int dist = 0;
		
		while (odd == 0) {
			for (int i: numArray) {
				if(i%2 != 0) {
					odd = numArray.indexOf(i);
				}
			}
		}
		
		while (even == 0) {
			for ( i: numArray) {
				if(i%2 != 0) {
					odd = numArray.indexOf(i);
				}
			}
		}
	}	
}