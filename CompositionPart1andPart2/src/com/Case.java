package com;

public class Case {
   private String model; 
   private String manufacturer; 
   private String powerSupply;
   private Dimension dimensions;
public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {
	super();
	this.model = model;
	this.manufacturer = manufacturer;
	this.powerSupply = powerSupply;
	this.dimensions = dimensions;
}
public void pressPowerButton() {
	System.out.println("Power button pressed ");
}
/**
 * @return the model
 */
public String getModel() {
	return model;
}
/**
 * @return the manufacturer
 */
public String getManufacturer() {
	return manufacturer;
}
/**
 * @return the powerSupply
 */
public String getPowerSupply() {
	return powerSupply;
}
/**
 * @return the dimensions
 */
public Dimension getDimensions() {
	return dimensions;
} 

   
   
   
}
