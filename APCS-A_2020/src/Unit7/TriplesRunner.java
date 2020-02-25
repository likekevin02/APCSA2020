package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	  	   
	   System.out.println("Type a number: ");
	   Scanner keyboard = new Scanner(System.in);
	   int number = 0;
	   number = keyboard.nextInt();
	   Triples test = new Triples(number);
	   System.out.println(test);
	   
   }
}