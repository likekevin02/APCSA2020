package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for(int num : ray) {
			if(num>ray[ray.length-1]) {
				sum += num;
			}
		}
		
		if (sum == 0) {
			return -1;
		} else {
			return sum;
		}
	}
}