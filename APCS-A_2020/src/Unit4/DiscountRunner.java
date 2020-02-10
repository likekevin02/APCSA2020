	package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.println("Bill after discout :: " + String.format("%.2f",Discount.getDiscountedBill(amt)));
		System.out.println("\n");
		
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		System.out.println("Bill after discout :: " + String.format("%.2f",Discount.getDiscountedBill(amt1)));
		System.out.println("\n");
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		System.out.println("Bill after discout :: " + String.format("%.2f",Discount.getDiscountedBill(amt2)));
		System.out.println("\n");
		
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		System.out.println("Bill after discout :: " + String.format("%.2f",Discount.getDiscountedBill(amt3)));
		System.out.println("\n");

	}
}