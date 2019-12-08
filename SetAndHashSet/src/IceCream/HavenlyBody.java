package IceCream;
import java.util.*; 
public final class HavenlyBody {
	 private final String name; 
	 private final double orbitalPeriod;
	 private final Set<HavenlyBody> satellites; 
	 
	 
	 public HavenlyBody(String name, double orbitalPeriod) {
		 this.name=name; 
		 this.orbitalPeriod=orbitalPeriod; 
		 this.satellites=new HashSet<>(); 
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 
	 public double getOrbitalPeriod() {
		 return orbitalPeriod;  
	 }
	 
	 public boolean addMoon(HavenlyBody moon) {
		 return this.satellites.add(moon); 
	 }

	public Set<HavenlyBody> getSatellites() {
		return new HashSet<>(satellites);
	}
	 
    @Override
    public boolean equals(Object obj) {
    	if(this == obj) {
    		return true; 
    	}
    	System.out.println("obj.getClass() is "+obj.getClass());
    	System.out.println("this.getClass() is "+this.getClass());
    	
    	if(obj==null || (obj.getClass()!=this.getClass())) {
    		return false; 
    	}
    	
    	String objName = ((HavenlyBody)obj).getName(); 
    	return this.name.equals(objName); 
    }

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashcode called");
		return this.name.hashCode() + 57; 
		
	}
    
     
	
	  
	 
}
