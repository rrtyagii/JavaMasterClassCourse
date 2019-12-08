package com;

public class HealthyBurger extends Hamburger {
     private String addition1;
     private double price1; 
     private String addition2; 
     private double price2; 
     
     private double total; 
     
     
     
	public HealthyBurger(String meat, double price) {
		super("Brown rye bread roll", meat, price, "HealthyBurger");
		// TODO Auto-generated constructor stub
	}
	
	public void addition(String addition1, double price1) {
		this.addition1=addition1; 
		this.price1=price1; 
         total=getPrice()+this.price1; 
	}
	
	public void addition2(String addition2, double price2) {
		this.addition2=addition2; 
		this.price2=price2;
		total+=price2; 
	}
	
	public double totalPriceofHealthy() {
		
		return total; 
	}

	/**
	 * @return the addition1
	 */
	public String getAddition1() {
		return addition1;
	}

	/**
	 * @param addition1 the addition1 to set
	 */
	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}

	/**
	 * @return the price1
	 */
	public double getPrice1() {
		return price1;
	}

	/**
	 * @param price1 the price1 to set
	 */
	public void setPrice1(double price1) {
		this.price1 = price1;
	}

	/**
	 * @return the addition2
	 */
	public String getAddition2() {
		return addition2;
	}

	/**
	 * @param addition2 the addition2 to set
	 */
	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}

	/**
	 * @return the price2
	 */
	public double getPrice2() {
		return price2;
	}

	/**
	 * @param price2 the price2 to set
	 */
	public void setPrice2(double price2) {
		this.price2 = price2;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
