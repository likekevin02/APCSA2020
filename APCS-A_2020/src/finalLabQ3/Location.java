package finalLabQ3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Location implements Comparable<Location> {
	private String location;
	private Stats myStats;
	private int myRank;
	private ArrayList<College> colleges;

	public Location(String loc) {
		setLocation(loc);
		colleges = new ArrayList<College>();
	}

	public String getLocation() {
		return location;
	}

	public ArrayList<College> getColleges() {
		return colleges;
	}

	public int getRank() {
		return myStats.getRank();
	}

	public void setLocation(String loc) {
		location = loc;
	}

	public void setColleges(ArrayList<College> col) {
		colleges = col;
	}

	public void addCollege(College college) {
		colleges.add(college);
	}

	public void sort() {
		Collections.sort(colleges);
	}

	public int compareTo(Location l) {
		String other = l.toString();
		for (int i = 0; i < 2; i++)
        {
            if (location.charAt(i) > other.charAt(i))
            {
                return 1;
            }
            if (location.charAt(i) < other.charAt(i))
            {
                return -1;
            }
        }
        return 0;
	}

	public String toString() {
		String output = "";
		output += "Location: " + location + "\n";
		output += colleges;
		return output;
	}


}
