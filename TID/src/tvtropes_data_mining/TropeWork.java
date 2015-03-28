package tvtropes_data_mining;

import java.util.ArrayList;

import useful.array.StringArrayToConsole;

/*
 * Class that represents a work of fiction.
 */
public class TropeWork {
	public String name = "";										//Name of the work.
	public ArrayList<String> tropesRaw = new ArrayList<String>();	//Tropes that the work has, as Strings.
	public ArrayList<Integer> tropes = new ArrayList<Integer>();	//Tropes that the work has, as enums.
	
	TropeWork(){
		
	}
	
	TropeWork(String name){
		setName(name);
	}
	
	TropeWork(String name, ArrayList<String> tropesRaw){
		setName(name);
		setTropesRaw(tropesRaw);
	}
	
	@Override
	public String toString() {
		return "Trope [Name: " + getName() + ", Tropes: " + getNumberOfTropes() + "]";
	}

	public void showTropesInConsole(){
		StringArrayToConsole.showInConsole(getTropesRaw());
	}
	
	/**
	 * If no enum tropes exist, get the number of String tropes.
	 * @return	Number of tropes the work contains.
	 */
	public int getNumberOfTropes(){
		if(!tropes.isEmpty())
			return tropes.size();
		else
			return tropesRaw.size();
	}

//TODO saveIntoFile()
	
	/*
	 * Getters and setters.
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getTropesRaw() {
		return tropesRaw;
	}

	public void setTropesRaw(ArrayList<String> tropesRaw) {
		this.tropesRaw = tropesRaw;
	}
}
