package om;

import java.util.*;

public class GroceryList {
	private Scanner scan = new Scanner(System.in); 
	
	private ArrayList<String> groceryList=new ArrayList<String>() ; 
	
	
	
	/**
	 * @return the groceryList
	 */
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void addGroceryItem(String item) {
		groceryList.add(item); 
	}
	
	public void printGroceryList() {
		System.out.println("you have "+groceryList.size()+" items in you list");
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println((i+1) + " , " + groceryList.get(i) );
		}
	}
	public void modifyGroceryItem(String newItem, String currentItem) {
		int position=findItem(currentItem); 
		if(position>=0) {
			modifyGroceryItem(position, newItem);
		}
		
	}
	private void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem); 
		System.out.println("Groc ery item at "+(position+1)+" has been modified");
	}
	public void removeGroceryItem(String Item) {
		int position=findItem(Item); 
		if(position>=0) {
			removeGroceryItem(position);
		}
	}
	private void removeGroceryItem(int position) {
		groceryList.remove(position); 
	}
   private int findItem(String searchItem) {
         return groceryList.indexOf(searchItem); 
	   
   }
   public String findItems(String searchItem) {
	   boolean exists=groceryList.contains(searchItem); 
		  int position=groceryList.indexOf(searchItem); 
		  
		 return position>=0?groceryList.get(position):null; 
   }
   /*  public static void processArrayList(){
    * ArrayList<String> newArray = new ArrayList<String>(); 
    * newArray.addAll(groceryList.getGroceryList() ); 
    * 
    * ArrayList<String> nextArray = new ArrayLists<String>(groceryList.getGroceryList()); 
    * 
    * String[] myArray = new String[groceryList.getGroceryList().size()]; 
    * myArray= groceryList.getGroceryList().toArray(myArray); 
    * 
    * }
    */
	
	 
}
