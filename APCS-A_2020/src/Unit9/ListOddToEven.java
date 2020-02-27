package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int  go( List<Integer> ray )
	{
		int odd = -1;
		int even = -1;
		int i = 0;

		while (i < ray.size() && odd < 0) {
			if (ray.get(i) % 2 == 1 || ray.get(i) % 2 == -1) {
				odd = i;
			} else {
				i++;
			}
		}

		while (i < ray.size() && even < 0) {
			if (ray.get(i) % 2 == 0) {
				even = i;
			} else {
				i++;
			}
		}

		if (odd >= 0 && even >= 0) {
			return even - odd;
		} else {
			return -1;
		}
	}
}