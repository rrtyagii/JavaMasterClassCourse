package dontThinkTooMuch;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Locations implements Map<Integer, Anything> {
	
  private static Map<Integer, Anything> locations=new HashMap<Integer, Anything>();
  
    public static void main(String[] args) throws IOException {
	   FileWriter localFile =null; 
	  try {
	   localFile=new FileWriter("location.txt"); 
	   for(Anything any:locations.values() ) {
		   localFile.write(any.getLocationID()+" , "+any.getDescription()); 
	   }
	  }  finally {
		   System.out.println("In finally block");
		 
			   if(localFile!=null) {
				   System.out.println("Attempting to close the file");
				   localFile.close();
			   }
		   
	   }
	   
	  
    }
  
    static {
    	 Map<String, Integer> tempExit = new HashMap<String, Integer>(); 	 
		  locations.put(0, new Anything(0, "You are sitting in events service office.", tempExit)); 
		     
		  tempExit = new HashMap<String, Integer>();
		  tempExit.put("W", 2);
		  tempExit.put("E", 3);
		  tempExit.put("S", 4);
		  tempExit.put("W", 5);
//		  tempExit.put("Q", 0);
		  locations.put(1, new Anything(1, "You are standing on 33rd street near the red building.",tempExit)); 
		  
		  tempExit = new HashMap<String, Integer>();
		  tempExit.put("N", 5);
//		  tempExit.put("Q", 0);
		  locations.put(2, new Anything(2, "You are at the MTCC.",tempExit)); 
		  
		  tempExit = new HashMap<String, Integer>();
		  tempExit.put("W", 1);
//		  tempExit.put("Q", 0);
		  locations.put(3, new Anything(3, "You are inside the hermann hall.",tempExit)); 
		  
		  tempExit = new HashMap<String, Integer>();
		  tempExit.put("N", 1);
		  tempExit.put("W", 2);
//		  tempExit.put("Q", 0);
		  locations.put(4, new Anything(4, "You are going to the Keating Building.",tempExit)); 
		  
		  tempExit = new HashMap<String, Integer>();
		  tempExit.put("S", 1);
		  tempExit.put("W", 2);
//		  tempExit.put("Q", 0);
		  locations.put(5, new Anything(5, "You are going from IIT Tower to Stuart Building and back.",tempExit)); 
    }
	
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return locations.size();
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return locations.isEmpty();
		}
		
		@Override
		public boolean containsKey(Object key) {
			// TODO Auto-generated method stub
			return locations.containsKey(key); 
		}
		
		@Override
		public boolean containsValue(Object value) {
			// TODO Auto-generated method stub
			return locations.containsValue(value);
		}
		
		@Override
		public Anything get(Object key) {
			// TODO Auto-generated method stub
			return locations.get(key);
		}
		
		@Override
		public Anything put(Integer key, Anything value) {
			// TODO Auto-generated method stub
			return locations.put(key, value);
		}
		
		@Override
		public Anything remove(Object key) {
			// TODO Auto-generated method stub
			return locations.remove(key);
		}
		
		@Override
		public void putAll(Map<? extends Integer, ? extends Anything> m) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			locations.clear();
		}
		
		@Override
		public Set<Integer> keySet() {
			// TODO Auto-generated method stub
			return locations.keySet();
		}
		
		@Override
		public Collection<Anything> values() {
			// TODO Auto-generated method stub
			return locations.values();
		}
		
		@Override
		public Set<Entry<Integer, Anything>> entrySet() {
			// TODO Auto-generated method stub
			return locations.entrySet();
		}   

}
