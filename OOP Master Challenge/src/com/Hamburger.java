package com;

public class Hamburger {
	private String  breadType; 
	private String meat; 
	private String name; 
//	private boolean lettuce; 
//	private boolean tomato; 
//	private boolean humus; 
//	private boolean cheese; 
	private double price; 
	
	public Hamburger(String bread, String meat,double price, String name) {
		this.breadType=bread;
		this.meat=meat; 
	   this.price=price;
	   this.name=name;
	}
	 
	/**
	 * @return the breadType
	 */
	public String getBreadType() {
		return breadType;
	}

	/**
	 * @param breadType the breadType to set
	 */
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	/**
	 * @return the meat
	 */
	public String getMeat() {
		return meat;
	}

	/**
	 * @param meat the meat to set
	 */
	public void setMeat(String meat) {
		this.meat = meat;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public double lettuce(){
			//if(this.lettuce==true) {
				price=price+0.5; 
			//}
			return price; 
			
		}
	public double tomato() {
//		if(this.tomato) {
			price+=0.5; 
//		}
		return price; 
	}
	
	public double humus() {
//		if(this.humus) {
			price+=0.5; 
//		}
		return price; 
	}
	public double cheese() {
//		if(this.cheese) {
			price+=0.5; 
//		}
		return price; 
	}
	
	public double totalBurgerPrice() {
		double totalPrice=this.price; 
		System.out.println("Your price of burger with all the additions that you took"
				+" out of lettuce, cheese, tomato, humus is ");
		return totalPrice; 
	}
	
	
}
