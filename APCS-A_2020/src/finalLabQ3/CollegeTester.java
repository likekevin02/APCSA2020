package finalLabQ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import core.data.*;

public class CollegeTester {
	public static void main(String[] args) {
		DataSource ds = DataSource.connect("src/finalLabQ3/CollegeRankings.csv");
		ds.setCacheTimeout(15 * 60);
		ds.load();
		ds.printUsageString();

		ArrayList<Stats> allStats = ds.fetchList(Stats.class, "Rank", "Tuition", "Acceptance rate", "SAT");
		ArrayList<College> allColleges = ds.fetchList(College.class, "Name", "Location");

		for (int i = 0; i < allColleges.size(); i++) {
			allColleges.get(i).setStats(allStats.get(i));
		}

		System.out.println(allColleges.get(0));
		System.out.println(allColleges.get(1));

	}
}