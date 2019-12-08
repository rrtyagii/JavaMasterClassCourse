package rasberry;
 /* We will try to make this class immutable with the help of Tim Buchalka */
import java.util.*;

public class Location {
  
	 private final int locationID; 
	 private final String description; 
	 private final Map<String, Integer>exits; 
	 
	 
	 public Location(int locationID, String description, Map<String, Integer> exits) {
		 this.locationID=locationID; 
		 this.description=description; 
		 this.exits= exits;
		 this.exits.put("Q", 0); 
	 }
	 
//      public void addExit(String direction, int location) {
//    	  exits.put(direction, location); 
//      }

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
