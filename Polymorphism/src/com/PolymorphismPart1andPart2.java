package com ;

class Car{
     private int numberDoor; 
     private int numberSeats; 
     private boolean engine; 
     private String manufacturer;
     private int cylinders;
     private int wheels; 
     
	public Car(int numberDoor, int numberSeats, String manufacturer, int cylinders) {
		super();
		this.numberDoor = numberDoor;
		this.numberSeats = numberSeats;
		this.manufacturer = manufacturer;
		this.cylinders = cylinders;
	    this.wheels=4; 
	    this.engine=true; 
	}
  public void startCar() {
	  System.out.println("Engine is started");
	  if(engine==false) {
		  this.engine=true; 
	  }
	  
  }
  public void stop() {
	  this.engine=false; 
	  System.out.println("this stops the car");
  }
  public void acceleration() {
	  System.out.println("this is for acceleration");
  }
	/**
	 * @return the numberDoor
	 */
	public int getNumberDoor() {
		return numberDoor;
	}

	/**
	 * @return the numberSeats
	 */
	public int getNumberSeats() {
		return numberSeats;
	}

	/**
	 * @return the engine
	 */
	public boolean isEngine() {
		return engine;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @return the cylinders
	 */
	public int getCylinders() {
		return cylinders;
	}

	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}
 
}

class Maruti extends Car{

	public Maruti(String manufacturer, int cylinders) {
		super(2, 5, manufacturer, cylinders);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.Car#startCar()
	 */
	@Override
	public void startCar() {
		// TODO Auto-generated method stub
	System.out.println("Maruti is started");
	}

	/* (non-Javadoc)
	 * @see com.Car#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Maruti stops");
	}

	/* (non-Javadoc)
	 * @see com.Car#acceleration()
	 */
	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
	System.out.println("maruti accelerated");
	}
	
	
	
}

class Lamborghini extends Car{
	public Lamborghini(String manufacturer, int cylinders) {
		super(2, 2, manufacturer, cylinders) ; 
	}

	/* (non-Javadoc)
	 * @see com.Car#startCar()
	 */
	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		System.out.println("lambo is started");
	}

	/* (non-Javadoc)
	 * @see com.Car#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	 System.out.println("lambo is stopped");
	}

	/* (non-Javadoc)
	 * @see com.Car#acceleration()
	 */
	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("lambo is accelerated");
	}
	
}

class Ford extends Car{
	public Ford(String manufacturer, int cylinders) {
		super(2, 2, manufacturer, cylinders) ; 
	}

	/* (non-Javadoc)
	 * @see com.Car#startCar()
	 */
	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		System.out.println("lambo is started");
	}

	/* (non-Javadoc)
	 * @see com.Car#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	 System.out.println("lambo is stopped");
	}

	/* (non-Javadoc)
	 * @see com.Car#acceleration()
	 */
	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("lambo is accelerated");
	}
	
}

public class PolymorphismPart1andPart2 {
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
	public static void main (String args[]) {
	Car carro = new Car(4, 5, "Base car", 8);
	
	carro.acceleration();
	carro.startCar();
	carro.stop();
	
	Car swift=new Maruti("maybe maruti itself", 4); 
	swift.acceleration();
	swift.startCar();
	swift.stop();
	}

}
