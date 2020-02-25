package Unit8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven {
	public static int go(int[] ray) {
		int odd = -1;
		int even = -1;
		int i = 0;

		while (i < ray.length && odd < 0) {
			if (ray[i] % 2 == 1 || ray[i] % 2 == -1) {
				odd = i;
			} else {
				i++;
			}
		}

		while (i < ray.length && even < 0) {
			if (ray[i] % 2 == 0) {
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