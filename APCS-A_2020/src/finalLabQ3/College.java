package finalLabQ3;


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class College implements Comparable<College>{
	private String name;
	private String location;
	private Stats myStats;
	private int myRank;
	
	public College(String nm, String loc) {
		setName(nm);
		setLocation(loc);
		myStats = new Stats();
	}

	public String getName() {
		return name;
	}
	
	
	public Stats getMyStats() {
		return myStats;
	}
	
	public String getLocation() {
		return location;
	}

	public void setName(String nm) {
		name = nm;
	}
	
	public void setLocation(String loc) {
		location = loc;
	}
	
	public void setStats(Stats s) {
		myStats = s;
	}
	
	public int getMyRank() {
		return myStats.getRank();
	}
	
	public int compareTo(College other) {
		if (getMyRank() > other.getMyRank()) 
			return -1;
		else if (getMyRank() < other.getMyRank())
			return 1;
		else 
			return 0;
	}
	
	public String toString() {
		String output = "";
		output += "College: " + name + "\n";
		output += myStats + "\n";
		return output;
	}

	
}
