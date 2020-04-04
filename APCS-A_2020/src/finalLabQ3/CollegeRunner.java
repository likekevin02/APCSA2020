package finalLabQ3;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import core.data.DataSource;

import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class CollegeRunner {
	public static void main(String args[]) {
		DataSource ds = DataSource.connect("src/finalLabQ3/CollegeRankings.csv");
		ds.setCacheTimeout(15 * 60);
		ds.load();

		ArrayList<Stats> allStats = ds.fetchList(Stats.class, "Rank", "Tuition", "Acceptance rate", "SAT");
		ArrayList<College> allColleges = ds.fetchList(College.class, "Name", "Location");
		ArrayList<Location> allLocations = new ArrayList<Location>();

		// loop through all players
		for (int i = 0; i < allColleges.size(); i++) {
			Player plr = allPlayers.get(i);

			// set the players stats to the corresponding stats object
			plr.setStats(allStats.get(i));

			// Check if the players team is already in the team list
			boolean teamInList = false;
			for (NFLTeam team : teamList) {
				// if team already in team list add player to the team
				if (plr.getTeamName().equals(team.getName())) {
					team.addPlayer(plr);
					teamInList = true;
					break;
				}
			}

		// loop through all the teams
		Collections.sort(teamList);
		for (NFLTeam t : teamList) {
			System.out.println(t);
		}

	}
}