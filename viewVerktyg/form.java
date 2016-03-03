package viewVerktyg;

import java.util.ArrayList;

public class Form {
	private String query;
	private ArrayList<String> options;
	private int corrAns;
	
	public Form(){
		
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getCorrAns() {
		return corrAns;
	}
	public void setCorrAns(int corrAns) {
		this.corrAns = corrAns;
	}
	public ArrayList<String> getOptions() {
		return options;
	}
	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}
}
