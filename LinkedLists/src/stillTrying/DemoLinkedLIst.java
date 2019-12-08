package stillTrying;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoLinkedLIst {
	public static void main(String[] args) {
     
	LinkedList<String> cities=new LinkedList<String>(); 
	addInAlaphbeticalOrder("Ooty", cities);
	addInAlaphbeticalOrder("Sydney", cities); 
	addInAlaphbeticalOrder("New Delhi", cities);
	addInAlaphbeticalOrder("Mumbai", cities);
	addInAlaphbeticalOrder("Boston", cities);
	addInAlaphbeticalOrder("Zurich", cities);
	addInAlaphbeticalOrder("Munich", cities);
	System.out.println("===================");
	printList(cities);
	System.out.println("===================");
	addInAlaphbeticalOrder("Ooty", cities);
	addInAlaphbeticalOrder("Chicago", cities);
	System.out.println("===================");
	printList(cities);
	
//	cities.add("Sydney"); 
//	cities.add("Chicago"); 
//	cities.add("New Delhi"); 
//	cities.add("Boston"); 
//	cities.add("Mumbai"); 
//	cities.add("Brisbane"); 
//	
//	printList(cities); 
	
	
//	
//    System.out.println("**************");
//	cities.add(1, "Pinda ale jatt");
//	printList(cities); 
//    
//	cities.remove(4); 
//	System.out.println("**************");
//	printList(cities); 
	
	visit(cities);
	}
	
	
	private static void printList(LinkedList<String> list) {
		Iterator<String>i=list.iterator();  
		while(i.hasNext()) {
			System.out.println("Now visiting "+i.next());
		}
	 	System.out.println("**************");
	}
	
	private static boolean addInAlaphbeticalOrder(String newCity, LinkedList<String> linkedList) {
		 ListIterator<String> i=linkedList.listIterator(); 
		 while(i.hasNext()) {
			int comparision=i.next().compareTo(newCity); 
			
			if(comparision==0) {
				//equal do not add
				System.out.println(newCity+" is already included as a destination");
				return false; 
			}
			else if(comparision>0) {
				//new city should appear before the  this one
// if we were looking at New Delhi and added Muzaffarnagar as the newCity, then Muzaffarnagar
// alphabetically starts before New Delhi as M comes before B. 	
				i.previous(); 
	/* The problem here was we used next() when comparing, meaning our cursor is pointing to 
	 * next item in the list i.e the cursor is now pointing at BOSTON in the original list.
	 *  
	 * So we need to move back to the previous entry again, the one we are at. We will add
	 * Muzaffarnagar there and it will shift the index down automatically.  		
	 */
				i.add(newCity);
				System.out.println(newCity+" has been added successfully");
				return true; 
				
			}
			else if(comparision<0) {
				//move on the next Sydney
 /*For example we were at NewDelhi and added Ooty as a new city. Here alphabetically Ooty will 
  * fall behind N for new delhi. 
  * 
  *NO processing coz .next has automatically moved to next after returning NewDelhi 				
  */}
		 }
//if 	we didn't found a suitable place for the entry, it will go at the last in the list. 
	i.add(newCity);	
	return true; 
	
   	}

    private static void visit(LinkedList places) {
	  Scanner scan= new Scanner(System.in); 
	  boolean quit=false;
	  boolean goingForward=true; 
	  
	  
	  ListIterator<String>i=places.listIterator(); 
	  
	  if(places.isEmpty()) {
		  System.out.println("No cities in the itenarary");
		  return ; 
	  }
	  else {
		  System.out.println("now visiting "+i.next());
		  printMenu();
	  }
	  
	  while(!quit) {
		  int action=scan.nextInt(); 
		  scan.nextLine(); 
		  switch(action) {
		  case 0:
			   System.out.println("Holidays over");
		       quit=true; 
		       break; 
		  case 1:
			  if(!goingForward) {
				  if(i.hasNext()) {
					  i.next(); 
				  }
				  goingForward=true; 
			  }
			   if(i.hasNext()) {
				   System.out.println("now visiting "+i.next());
			   }
			   else {
				   System.out.println("reached the end of the list");
				   goingForward=false; 
			   }
			   break; 
		  case 2:
			  
			  if(goingForward) {
				  if(i.hasPrevious()) {
					  i.previous(); 
				  }
				  goingForward=false; 
			  }
			  if(i.hasPrevious()) {
				  System.out.println("now visiting "+i.previous());
			  }
			  else {
				  System.out.println("we are at the start of the list");
				  goingForward=true; 
			  }
			  break; 
		  case 3:
			  printMenu();
			  break; }
		}
	}

    private static void printMenu() {
    	System.out.println("Available option: \nPRESS");
    	System.out.println("0 -> to quit\n " +
    	                   "1 -> go to next city\n "+
    			           "2 -> go to previous city\n "+
    	                   "3 -> print menu");
    }

}


