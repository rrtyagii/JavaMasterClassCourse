package com; 
public class Inheritance {

	private String name; 
	private double money; 
	private int fields, membersOfFamily ; 

	public Inheritance() {
		this.fields=1;
		this.name="default" ; 
		this.money=0.0; 
		this.membersOfFamily=3; 
	     }
 	public Inheritance(String name, double money, int fields, int membersOfFamily) {
		this.name=name; 
		this.money=money; 
		this.fields = fields; 
		this.membersOfFamily=membersOfFamily; 
	     }
 	public void inherit() {
 		System.out.println("Inheritance.inherit() is called." );
 	}
 	public void doesHe(boolean really) {
           System.out.println("The question is does he really want to give you his "
           		+ "things? "); 
          System.out.println( "if yes print true! if no print false!"+really);   		
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
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}
	/**
	 * @return the fields
	 */
	public int getFields() {
		return fields;
	}
	/**
	 * @param fields the fields to set
	 */
	public void setFields(int fields) {
		this.fields = fields;
	}
	/**
	 * @return the membersOfFamily
	 */
	public int getMembersOfFamily() {
		return membersOfFamily;
	}
	/**
	 * @param membersOfFamily the membersOfFamily to set
	 */
	public void setMembersOfFamily(int membersOfFamily) {
		this.membersOfFamily = membersOfFamily;
	}
	  
}
