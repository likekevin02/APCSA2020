package finalLabQ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import core.data.*;

public class Stats {
	private String tuition;
	private String acceptance;
	private String SAT;
	private int rank;

	public Stats() {
		setRank(0);
		setTuition("$0");
		setAccept("0%");
		setSAT("0");
		
	}

	public Stats(int rnk, String tut, String acc, String sat) {
		setRank(rnk);
		setTuition(tut);
		setAccept(acc);
		setSAT(sat);
	}
	
	public String getTuition() {
		return tuition;
	}
	
	public String getAccept() {
		return acceptance;
	}
	
	public String getSAT() {
		return SAT;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setTuition(String tut) {
		tuition = tut;
	}
	
	public void setAccept(String acc) {
		acceptance = acc;
	}
	
	public void setSAT(String sat) {
		SAT = sat;
	}
	
	public void setRank(int rnk) {
		rank = rnk;
	}
	
	public String toString() {
		return "This college is ranked " + rank + " and has an acceptance rate of " + acceptance + ". Students that go to this college has a SAT range of " + SAT + " and pays " + tuition + " per year" + "\n";
	}
	


}