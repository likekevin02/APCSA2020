package finalLabQ3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

import core.data.DataSource;

public class StatsTester {
	public static void main(String[] args) {
		DataSource ds = DataSource.connect("src/finalLabQ3/CollegeRankings.csv"); 
	    ds.setCacheTimeout(15 * 60);  
	    ds.load();
	    ds.printUsageString();
	    
	    Stats test = ds.fetch(Stats.class, "Rank", "Tuition", "Acceptance rate", "SAT");
	    System.out.println(test);
	    
	}
}