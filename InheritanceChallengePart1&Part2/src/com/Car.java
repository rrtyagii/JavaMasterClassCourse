package com;

public class Car extends Vehicle {
	 
    private int door; 
    private int gears; 
    private boolean isManual; 
    private String colour; 
    
    
    private int currentGears;


	public Car(String type, int numberOfTyres, String size,  int door, int gears,
			boolean isManual, String colour) {
		super(type, numberOfTyres, size);  
		
		this.door = door;
		this.gears = gears;
		this.isManual = isManual;
		this.colour = colour;
		this.currentGears = 1;
	}

	public int getCurrentGears() {
		return currentGears;
	}

	public void setCurrentGears(int currentGears) {
		this.currentGears = currentGears;
	    System.out.println("Car.setCurrentGears(): changes to "+this.currentGears+" gear.");
	} 
	public void changeVelocity(double velocity, int direction) {
		
	 System.out.println("Car.changeVelocity(): Velocity "+velocity+" kmph"+
		" and in the direction of "+direction+" degrees" );
	 move(velocity, direction);
	}
  /*	
//	@Override ; 
//  */
//	public void stop() {
//		super.stop();
//	}
	
}
