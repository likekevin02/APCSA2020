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
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		/*int rand = 0;
		rand = (int) (Math.random()*3);
		if (rand == 0) {
			compChoice = "R";
		} else if (rand == 1) {
			compChoice = "P";
		} else {
			compChoice = "S";
		}*/
		
	}

	public String determineWinner()
	{
		String winner="";
	
		if (playChoice.equals("R")) {
			if (compChoice.equals("S")) {
				winner = "!Player wins <<Rock Breaks Scissors>>";
			} else if (compChoice.equals("P")) {
				winner = "!Computer wins <<Paper Covers Rock>>";
			} else {
				winner = "Draw";
			}	
		} else if (playChoice.equals("P")) {
			if (compChoice.equals("R")) {
				winner = "!Player wins <<Paper Covers Rock>>";
			} else if (compChoice.equals("S")) {
				winner = "!Computer wins <<Scissor Cuts Paper>>";
			} else {
				winner = "Draw";
			}
		}else if (playChoice.equals("S")) {
			if (compChoice.equals("P")) {
				winner = "!Player wins <<Scissor Cuts Paper>>";
			} else if (compChoice.equals("R")) {
				winner = "!Computer wins <<Rock Breaks Scissors>>";
			} else {
				winner = "Draw";
			}
		}
		return winner;
	}
	
	public void setComp() {
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

	public String toString()
	{
		this.setComp();
		String output="player had "+ playChoice +"\n" + "computer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}