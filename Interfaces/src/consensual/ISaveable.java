package consensual;

import java.util.*;


public interface ISaveable {
//	Create a simple interface (tip: name it Saveable or ISaveable)
//	// That interface allows an object to be saved to some sort of storage medium. (tip: 
//	 *  use arraylist)
//	// The exact type of medium is not known to the interface (nor to the classes that implement
//	 *  it).
//	// The interface will just specify two methods, one to return an ArrayList of values to be 
//	 * saved and the other to populate the object's fields from an ArrayList (parameter).
//		//
//	// Create a few sample classes that implement your Saveable interface (we've used the idea 
//	 * of a game, with Players and Monsters, but you can create any type of classes that you want
//	 * ).
//	 * 
	
	List<String> printArrayList();
	public void pass (List<String> arrList); 
	

}
