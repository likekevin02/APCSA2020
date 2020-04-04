package finalLabQ3;

import java.util.ArrayList;

import core.data.DataSource;

public class LocationTester {
	public static void main(String[] args) {
		DataSource ds = DataSource.connect("src/finalLabQ3/CollegeRankings.csv");
		ds.setCacheTimeout(15 * 60);
		ds.load();
		ds.printUsageString();

		ArrayList<Stats> allStats = ds.fetchList(Stats.class, "Rank", "Tuition", "Acceptance rate", "SAT");
		ArrayList<College> allColleges = ds.fetchList(College.class, "Name", "Location");
		Location test = new Location("MA");

		
		for (int i = 0; i < allColleges.size(); i++) {
			College col = allColleges.get(i);
			col.setStats(allStats.get(i));

			if (col.getLocation().contains("MA")) {
				test.addCollege(col);
			}
		}

		System.out.println(test);

	}

}