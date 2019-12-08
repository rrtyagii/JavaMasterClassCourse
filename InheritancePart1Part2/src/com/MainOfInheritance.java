package com;

public class MainOfInheritance extends Inheritance {

	private boolean wantTheInheritance; 
	private boolean doesYourParentsWantTo; 
	private double moneyIhave;
	private int numberOfLawyers;
	
	public MainOfInheritance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MainOfInheritance(double money, boolean wantTheInheritance,
			 boolean doesYourParentsWantTo, double moneyIhave, int numberOfLawyers) {
		
		super("Tyagi", money, 1, 5);
		// TODO Auto-generated constructor stub
		this.wantTheInheritance=wantTheInheritance;
		this.doesYourParentsWantTo=doesYourParentsWantTo; 
		this.moneyIhave=moneyIhave; 
		this.numberOfLawyers=numberOfLawyers;
	}
	
	public void inherit() {
		System.out.println("MainOfInheritance.inherit() is called. ");
		System.out.println("\n");
		super.inherit();
	/*   Here we are overriding the inherit method which was previously made in INHERITANCE
	 *   Class. 
	 *   What does override means? 
	 *   It means that we can choose the methods including constructor that are available 
	 *   from the superclass (here, INHERITANCE class) . These are the methods that can be
	 *   overridden in other words we can create a version of that same method that exists
	 *   in the superclass (here, INHERITANCE class), but make it unique for child class
	 *   (here MainOfInheritance class).
	 *   
	 *   (if we use the automatic generator, we will be given lists to choose which
	 *   methods including the constructor to override from the superclass or class which is written after the 
	 *    extends keyword above)
	 */
	}
	public void wantToGive() {
		System.out.println("Does want to give his things in inheritance");
	    doesHe(true);
	}
	public void doesNotWantToGive() {
		System.out.println("Doesn't want to give his things in inheritance");
	     doesHe(false); 
	}
	/* SUPER:- It is used inside a sub-class method definition to call a method defined in the \
	 *  super class. Private methods of the super-class cannot be called. Only public and 
	 *  protected methods can be called by the super keyword.
        It is also used by class constructors to invoke constructors of its parent class.
        Super keyword are not used in static Method
	 */
	
	


	
}
