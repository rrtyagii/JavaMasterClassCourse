package com;

public class Main {
  
	public static void main(String[] args) {
		Dimension dimensions=new Dimension(20, 20, 5); 
		
		Case theCase=new Case("2245bar", "DELL", "240", dimensions) ; 
		
		Monitor theMOnitor = new Monitor("127afasf", "Acer", 27, new Resolution(2540, 1440));
		
	   Motherboard theMotherboard=new Motherboard("83-5022", "Asus", 4, 6 , "v2.44"); 
	   
	   PC thePC = new PC(theCase, theMotherboard, theMOnitor); 
	 
	  thePC.getMonitor().drawPixelAt(1500, 1200, "Black");
	  thePC.getMotherboard().loadProgram("ApacheOfficeSuite");
	  thePC.getTheCase().pressPowerButton();
	  
	}
}
