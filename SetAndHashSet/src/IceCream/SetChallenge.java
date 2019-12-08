package IceCream;

import java.util.LinkedList;
import java.util.*;

public class SetChallenge {

	
        private final String name; 
        private final double orbitalPeriod; 
        private final Set<SetChallenge>satellites;
        private final LinkedList<String>bodyTypes=new LinkedList<String>(); 
        
        public SetChallenge(String name, double orbitalPeriod, String bodyType) {
        	this.name=name; 
        	this.orbitalPeriod=orbitalPeriod; 
        	satellites=new HashSet<>(); 
        	addBodyType(bodyType); 
        }
        
        public String getName() {
        	return this.name; 
        }
        public double getOrbitalPeriod() {
        	return this.orbitalPeriod; 
        }
        public Set<SetChallenge> getSatellites(){
        	return new HashSet<>(satellites); 
        }
        
        public boolean addSatellite(SetChallenge moon) {
        	return this.satellites.add(moon); 
        }
        
        public Set<SetChallenge> getSatellite(){
        	return new HashSet<>(satellites); 
        }
        
        public List<String> getBodyTypeList(){
        	return bodyTypes; 
        }
        /* think of how you can get a bodytype from the the respective entry. 
         * 
         */
		private boolean addBodyType(String bodyTypeName) {
        if(bodyTypeName.equalsIgnoreCase("STARS") || bodyTypeName.equalsIgnoreCase("PLANETS") ||
           bodyTypeName.equalsIgnoreCase("ASTEROID") || bodyTypeName.equalsIgnoreCase("MOON") ||  
           bodyTypeName.equalsIgnoreCase("COMET") ) {
        	return this.bodyTypes.add(bodyTypeName); 
           }
        else {
        	return false; 
          }
        }
		
		@Override
		public final boolean equals(Object obj) {
			if(this==obj) {
				return true; 
				
			}
			if(obj instanceof SetChallenge) {
				SetChallenge theObject= (SetChallenge)obj; 
				if(this.name.equals(theObject.getName())) {
					return this.bodyTypes == theObject.getBodyTypeList(); 
				}
			}
			return false; 
		}

        @Override
        public final int hashCode() {
        	return this.name.hashCode()+57+this.bodyTypes.hashCode(); 
        }
        
//        @Override
/*        public String toString() {
    ( TO OVERRIDE THE TOSTRING METHOD I WOULD NEED TO GET A METHOD THAT CAN GIVE ME THE 
      THE BODY TYPE FOR THE PARTICULAR ENTRY FROM THE LIST BY GETTING THE NAME AS A PARAMETER
      
        SOMEHOW I HAVE TO MAKE A LINK WHERE I CAN STORE THE ENTRY AS WELL AS BODYTYPE IN THE
        BODYTYPE LIST. )        
       
        
         	return this.name" : "+this.bodyTypes.g
          }
         
 */       
        public static final class Key{
    	   private String name; 
    	   private List<String> bodyTypes; 
    	   
    	   private Key(String name, List<String> bodyType) {
    		   this.name = name; 
    		   this.bodyTypes=bodyType; 
    	   }
    	   
    	   public String getName() {
    		   return this.name; 
    	   }
    	   public List<String> getBodyTYpe(){
    		   return bodyTypes; 
    	   }
    	   
    	   @Override
    	   public final boolean equals(Object obj) {
    		   Key key = (Key) obj; 
    		   if (this.name.equals(key.getName())) {
    			   return(this.bodyTypes==key.getBodyTYpe()); 
    		   }
    		   return false; 
    	   }
    	   
    	   @Override
    	   public final int hashCode() {
    		   return this.name.hashCode()+51586+this.bodyTypes.hashCode(); 
    	   }
               	   
       }
        
        
        
		/*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

        You can include as many types as you want, but must support at
        least PLANET and MOON.

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.

        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.

        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.

        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).

        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.

        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).

        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.

        5. Two bodies with the same name but different designations can be added to the same set.

        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
*/
    
		
		
		
	
}
