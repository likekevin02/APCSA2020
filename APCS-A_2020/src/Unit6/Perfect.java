package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int sum;

	public Perfect() {
		setNum(0);
	}
	
	public Perfect(int x) {
		setNum(x);
	}

	public void setNum(int x) {
		number = x;
	}
	
	public boolean isPerfect()
	{
		for(int i = 1; i < number; i++) {
			if (number % i == 0){
			sum += i;
			}
		}
		
		if (sum == number) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		if (isPerfect()) {
		return number +" is perfect";
		} else {
			return number + " is not perfect";
		}
	}
	
}