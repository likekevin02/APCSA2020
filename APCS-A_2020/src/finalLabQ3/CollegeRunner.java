package finalLabQ3;

import java.util.Arrays;
import java.util.Collections;
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

		for (int i = 0; i < allColleges.size(); i++) {
			College col = allColleges.get(i);
			col.setStats(allStats.get(i));

		}

		for (College t : allColleges) {
			System.out.println("Location: " + t.getLocation() + "\n" + t);
		}

	}

}