package dontThinkTooMuch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Locations locations=new Locations(); 
	
	   public static void main(String[] args) {
		  Scanner scan= new Scanner (System.in); 
		 
		  
		  Map<String, String> words = new HashMap<String, String>(); 
		  
		  words.put("QUIT", "Q"); 
		  words.put("NORTH", "N"); 
		  words.put("SOUTH", "S"); 
		  words.put("WEST", "W"); 
		  words.put("EAST", "E"); 
		  
		  
		   
		 int loc=1; 
		 while(true) {
			 System.out.println(locations.get(loc).getDescription());
			 if(loc==0) {
				 break; 
			 }
			 
			 Map<String, Integer> exits = locations.get(loc).getExits(); 
			 System.out.println("Available exits are : ");
			  for(String exit: exits.keySet())	 {
				  System.out.print(exit + " , ");
			  } System.out.println();
			  
			  String direction = scan.nextLine().toUpperCase();
			  if(direction.length()>1) {
				  String word[]=direction.split(" "); 
				  for(String worrd:word) {
					  if(words.containsKey(worrd)) {
						  direction =words.get(worrd); 
						  break; 
					  }
					  
				  }
			  }
			  
			  if(exits.containsKey(direction)) {
				  loc=exits.get(direction); 
				}
			  else {
				  System.out.println("you can't go in that direction. ");
			  }

		  }
	   }

}