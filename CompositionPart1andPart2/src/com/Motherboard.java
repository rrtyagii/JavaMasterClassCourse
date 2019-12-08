package com;

public class Motherboard {
   private String model;
   private String manufacturer; 
   private int ramSlots;
   private int cardSlots;
   private String bios; 
    
   
   public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, 
		   String bios) {
	   this.model=model; 
	   this.bios=bios; 
	   this.manufacturer=manufacturer; 
	   this.ramSlots=ramSlots; 
	   this.cardSlots=cardSlots; 
	   
   }
   public void loadProgram(String program) {
	   System.out.println("Program "+program+" is now loading....");
   }
   
   public String getModel() {
	   return model; 
	   
   }
   public String getManufacturer() {
	   return manufacturer; 
   }
   public String getBios() {
	   return bios; 
   }
   public int getRamSlots() {
	   return ramSlots;
   }
   public int getCardSlots() {
	   return cardSlots; 
   }
}
