package useful.regex;

import java.util.ArrayList;

public class MatchData {
	ArrayList<String> matches;	//String for each match.
	int count;					//Number of total matches.
	
	MatchData(){
		setMatches(new ArrayList<String>());
		setCount(0);
	}
	
	public ArrayList<String> getMatches() {
		return matches;
	}
	public void setMatches(ArrayList<String> matches) {
		this.matches = matches;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
