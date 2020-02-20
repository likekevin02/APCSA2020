package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int rand = 0;
		rand = (int) (Math.random()*3);
		if (rand == 0) {
			compChoice = "R";
		} else if (rand == 1) {
			compChoice = "P";
		} else {
			compChoice = "S";
		}
		
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice == "R" && compChoice == "S") {
			winner = "!Player wins <<Rock Breaks Scissors>>";
		} else if (playChoice == "P" && compChoice == "R") {
			winner = "!Player wins <<Paper Covers Rock>>";
		} else if (playChoice == "S" && compChoice == "P") {
			winner = "!Player wins <<Scissor Cuts Paper>>";
		} else if (compChoice == "R" && playChoice == "S") {
			winner = "!Computer wins <<Rock Breaks Scissors>>";
		} else if (compChoice == "P" && playChoice == "R") {
			winner = "!Computer wins <<Paper Covers Rock>>";
		} else if (compChoice == "S" && playChoice == "P") {
			winner = "!Computer wins <<Scissor Cuts Paper>>";
		}else {
			winner = "Draw";
		}
		return winner;
	}

	public String toString()
	{
		String output="player had "+ playChoice +"\n" + "computer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}