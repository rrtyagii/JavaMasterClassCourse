package com;

public class DeluxeHamburger extends Hamburger {

	private String chips; 
	private String drinks;
	public DeluxeHamburger(String bread, String meat, double price, String chips, String drinks) {
		super(bread, meat, price, "Deluxe Hamburger");
		this.chips=chips; 
		this.drinks=drinks; 
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the chips
	 */
	public String getChips() {
		return chips;
	}
	/**
	 * @param chips the chips to set
	 */
	public void setChips(String chips) {
		this.chips = chips;
	}
	/**
	 * @return the drinks
	 */
	public String getDrinks() {
		return drinks;
	}
	/**
	 * @param drinks the drinks to set
	 */
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
	
	
	
	
	 
}
