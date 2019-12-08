package com;

public class BankfortheChallenge {
	
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
 
	
	private int accountNumber, balance, phoneNumber; 
	private String customerName,email;
	
	public BankfortheChallenge() {
		this(00000, 00 , 050505050, "XXXXXXX", "xyz@abc.com" ) ;  // calling the parametarized
		System.out.println("empty constructor called");         //constructor 
    }
	public BankfortheChallenge(int accountNumber, int balance, int phoneNumber
			                   , String customerName,String email) {
		System.out.println("this is the parameterized constructor") ;
		
		this.accountNumber=accountNumber;
		this.balance=balance; 
		this.phoneNumber=phoneNumber; 
		this.customerName=customerName;
		this.email=email;
	}
	
   	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber; 
	}
	public int getAccountNumber() {
		return accountNumber; 
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	   // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) 
    // to confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
	
	public void depositFunds(int balance) {
		this.balance+=balance ; 
		System.out.println("deposit of "+balance+" made.New balance is "+this.balance);
	}
	
	public int withdrawFunds(int withdrawAmount) {
		if(this.balance-withdrawAmount<0) {
			return -1; 
		}
		else {
		return this.balance-withdrawAmount ; 
		}
	}
	
}
