package com;

public class Outlander extends Car {

	private int roadServiceMonth;

	public Outlander( String colour, int roadServiceMonth)
	{
		super("Car", 4, "4WD", 5, 6, false, colour);
		this.roadServiceMonth = roadServiceMonth;
		
	}
	public void accelerate(double rate) {
		double newVelocity=getVelocity()+rate; 
		if(newVelocity==0) {
			stop();
			setCurrentGears(1);
		}
		else if(newVelocity>0 && newVelocity<=10) {
			setCurrentGears(1);
		}
		else if(newVelocity>10 && newVelocity<=20) {
			setCurrentGears(2);
		}
		else if(newVelocity >20 && newVelocity<=60) {
			setCurrentGears(3);
		}
		else if(newVelocity>60 && newVelocity <=90) {
			setCurrentGears(4);
		}
		else if(newVelocity>90 && newVelocity<=140) {
			setCurrentGears(5);
		}
		else {
			setCurrentGears(6); 
			System.out.println("max speed reached");
		}
		
	
		 if(newVelocity>0) {
			 changeVelocity(newVelocity, getDirection());
		 }
	}
	
	
	
	
}
