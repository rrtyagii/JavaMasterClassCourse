package cog;

import java.util.ArrayList;

public class Customer {
	  private String name; 
	  private ArrayList<Double> transactions; 
	  
	  public Customer(){
		  this.name ="DEFAULT NAME"; 
		  this.transactions.add(null); 
	  }
	  public Customer(String name, double initialAmount) {
		  this.name=name; 
		  this.transactions=new ArrayList<Double>();
		  addTransaction(initialAmount);
		  
	  }
	  public void addTransaction(double amount) {
		  this.transactions.add(amount); 
	  }
	  
	  public Customer createCustomer(String name, double amount) {
		  return new Customer(name, amount); 
	  }
	  
	  
	/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @return the transactions
		 */
		public ArrayList<Double> getTransactions() {
			return transactions;
        }
  
  
}
