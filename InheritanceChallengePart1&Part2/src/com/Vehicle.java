package com;

/*       	    // Challenge.
.   Start with a base class of a Vehicle, then create a Car class that inherits from this base
    class.
.   Finally, create another class, a specific type of Car that inherits from the Car class.
.   You should be able to hand steering, changing gears, and moving (speed in other words).
.   You will want to decide where to put the appropriate state and behaviours (fields and 
   methods).
.   As mentioned above, changing gears, increasing/decreasing speed should be included.
.   For you specific type of vehicle you will want to add something specific for that 
   type of car.
 * 
 */
public class Vehicle {
	
	private String type ; 
	private int numberOfTyres; 
	private double velocity; 
	/**
	 * @return the velocity
	 */
	public double getVelocity() {
		return velocity;
	}
	/**
	 * @param velocity the velocity to set
	 */
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	private int direction; 
	private String size; 
	
	public Vehicle(String type, int numberOfTyres, String size) {
		this.type=type; 
		this.numberOfTyres=numberOfTyres; 
		this.size=size;
		
		this.velocity=0;
		this.direction=0; 
	}
	public void steer(int direction) {
		this.direction+=direction; 
	System.out.println("Vehicle.steer() is Steering at "+this.direction+" degrees. ");
	
	}
	public void stop() {
		this.velocity=0.0; 
	}
	public void move(double velocity, int direction) {
		this.velocity =velocity; 
		this.direction =direction;
		
  System.out.println("Vehicle.steer() is Steering at "+this.direction+" degrees with "
  		+ this.velocity +" kmph ");
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfTyres() {
		return numberOfTyres;
	}

	public void setNumberOfTyres(int numberOfTyres) {
		this.numberOfTyres = numberOfTyres;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	


}
