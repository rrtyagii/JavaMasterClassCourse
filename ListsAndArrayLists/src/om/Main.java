package om;
import java.util.*;

public class Main {
		private static Scanner scan=new Scanner(System.in); 
		private static GroceryList glist=new GroceryList(); 
		 
		public static void main(String [] args) {
		 boolean quit = false; 
		 int choice=0; 
		  printInstructions(); 
		  
		  while(!quit) {
		   System.out.println("enter your choice: ");
		    choice=scan.nextInt() ; 
		    
		    scan.nextLine(); 
		    
		    switch(choice) {
		    case 0:
		    	printInstructions(); 
		    	break; 
		    case 1:
		    	glist.printGroceryList();
		    	break; 
		    case 2:
		    	addItem(); 
		    	break; 
		    case 3:
		    	modify(); 
		    	break; 
		    case 4:
		    	remove(); 
		    	break; 
		    case 5:
		    	findItems(); 
		    	break; 
		    case 6:
		    	quit=true; 
		    	break; 
		    	default:
		    		quit=false; 
		    		break; 
		    
		      }
		    }
		}
		public static void printInstructions() {
			System.out.println("\n PRESS");
		    System.out.println("\t 0 - TO PRINT THE CHOICE OPTIONS. ");
		    System.out.println("\t 1 - TO PRINT THE LIST OF GROCERY ITEMS.");
		    System.out.println("\t 2 - TO ADD AN ITEM TO THE GROCERT LIST ");
		    System.out.println("\t 3 - TO MODIFY THE ITEM OF THE LIST. ");
		    System.out.println("\t 4 - TO REMOVE THE ITEM OF THE LIST. ");
		    System.out.println("\t 5 - TO SEARCH FOR AN ITEM IN THE LIST");
		    System.out.println("\t 6 - TO QUIT THE APPLICATION");
		
		}
		
		public static void addItem() {
			System.out.println("Please enter the item you want to add. ");
			glist.addGroceryItem(scan.nextLine());
		}
		public static void modify() {
			System.out.println("Enter the Item number to modify");
			String itemNo=scan.nextLine();
			scan.nextLine(); 
			System.out.println("Please enter the item to modify");
		    String newItem= scan.nextLine(); 
		    
		    glist.modifyGroceryItem(newItem, itemNo);
		}
		public static void remove() {
			System.out.println("enter the item number to remove. ");
			glist.removeGroceryItem(scan.nextLine());
			
		}
		public static void findItems() {
			System.out.println("enter the Item to search for: ");
			String searchItem = scan.nextLine(); 
			if(glist.findItems(searchItem)!=null) {
				System.out.println("Found "+searchItem+ " in our grocery list. ");
			}
			else {
				System.out.println(searchItem+ "is not in the shopping list. ");
			}
			
		}
		

}
