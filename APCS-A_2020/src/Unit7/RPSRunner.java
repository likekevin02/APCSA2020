package Unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String response;
		String response1;
		boolean again = true;
		// add in a do while loop after you get the basics up and running
		while (again) {

			String player = "";

			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");

			// read in the player value

			response = keyboard.nextLine();
			RockPaperScissors game = new RockPaperScissors(response);
			System.out.println(game);
			System.out.println("Do you want to play again?");
			response1 = keyboard.nextLine();
			if (response1.equals("N")){
				break;
			}
		}
	}

}
