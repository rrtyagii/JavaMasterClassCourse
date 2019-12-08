package dontThinkTooMuch;

import java.util.HashMap;
import java.util.Map;

public class Anything {
	
	private final int locationID; 
	 private final String description; 
	 private final Map<String, Integer>exits; 
	 
	 
	 public Anything(int locationID, String description, Map<String, Integer> exits) {
		 this.locationID=locationID; 
		 this.description=description; 
		 this.exits= exits;
		 this.exits.put("Q", 0); 
	 }
	 
//     public void addExit(String direction, int location) {
//   	  exits.put(direction, location); 
//     }

	/**
	 * @return the locationID
	 */
	public int getLocationID() {
		return locationID;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @return the exits
	 */
	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}

}
