package com;
/*

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.
    
*/
public class VIPCustomer{
	
           private String emailAddress, name;
           private double creditLimit; 
           
      public VIPCustomer() {
    	 this("xyz@abc.com", "default Name", 000000) ;  
    	 System.out.println("DEFAULT CONSTRUCTOR IS CALLED");
      }
      public VIPCustomer( String emailAddress, String name ) {
    	  this(emailAddress, name, 00000) ; 
      }
      public VIPCustomer(String emailAddress, String name, double creditLimit) {
    	  System.out.println("PARAMETERIZED CONSTRUCTOR IS CALLED");
    	  this.creditLimit=creditLimit; 
    	  this.emailAddress=emailAddress;
    	  this.name=name; 
      }
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
      

}
