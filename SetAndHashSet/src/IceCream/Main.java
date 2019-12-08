package IceCream;

import java.util.*; 

public class Main {
	private static Map<String, HavenlyBody>solarSystem= new HashMap<>(); 
	private static Set<HavenlyBody> planets = new HashSet<>(); 
	
  public static void main(String[] args) {
	 HavenlyBody temp = new HavenlyBody("Mercury", 88); 
	 solarSystem.put(temp.getName(), temp);
	 planets.add(temp); 
	 
	 temp = new HavenlyBody("Venus", 225);  
	 solarSystem.put(temp.getName(), temp);
	 planets.add(temp);
	 
	 temp = new HavenlyBody("Earth", 365); 
	 solarSystem.put(temp.getName(), temp);
	 planets.add(temp);
	 
	 HavenlyBody tempMoon = new HavenlyBody("Moon", 27); 
	 solarSystem.put(tempMoon.getName(),tempMoon); 
	 temp.addMoon(tempMoon);  
	 
	 temp = new HavenlyBody("Mars", 686.971 ); 
	 solarSystem.put(temp.getName(), temp);
	 planets.add(temp);
	 
	 tempMoon = new HavenlyBody("Deimons", 1.3); 
	 solarSystem.put(tempMoon.getName(), tempMoon); 
	 temp.addMoon(tempMoon); 
	 
	 tempMoon= new HavenlyBody("Phobos", 0.3); 
	 solarSystem.put(tempMoon.getName(), tempMoon); 
	 temp.addMoon(tempMoon); 
	 
	 System.out.println("Planets :- ");
	 for(HavenlyBody planet:planets) {
		 System.out.println("\t"+planet.getName());
	 }
	 
	 HavenlyBody body = solarSystem.get("Earth"); 
	 System.out.println("Moons of " + body.getName()+" :-");
	 for(HavenlyBody earthMoon: body.getSatellites()) {
		 System.out.println("\t"+earthMoon.getName()+" \t" + earthMoon.getOrbitalPeriod());
	}
	 
	 body = solarSystem.get("Mars"); 
	 System.out.println("Moons of " + body.getName()+" :-" );
	 for(HavenlyBody marsMoon: body.getSatellites()) {
		 System.out.println("\t" + marsMoon.getName()+" \t" + marsMoon.getOrbitalPeriod());
	 }
	 
	 
	 Set<HavenlyBody> moons = new HashSet<>(); 
	 for(HavenlyBody planet: planets) {
		 moons.addAll(planet.getSatellites()); 
	 }
	 
	 System.out.println("All moon in one set");
	 for(HavenlyBody moon : moons) {
		 System.out.println("\t"+moon.getName());
	 }
	 
	 HavenlyBody mars=new HavenlyBody("Mars", 700); 
	 planets.add(mars); 
	 
	 for(HavenlyBody planet:planets) {
		 System.out.println(planet.getName()+": "+planet.getOrbitalPeriod());
	 }
	 
	 
	 Object o = new Object(); 
	 o.equals(o); 
	 "mars".equals(""); 
	 
  }
}
