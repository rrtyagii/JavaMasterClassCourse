package cog;
import java.util.*;

public class Branch {
	
	private String branchName; 
	private ArrayList<Customer> customer; 
	 private Customer help; 
	
	public Branch() {
		this.branchName="DEFAULT BRANCH NAME"; 
		this.customer.add(null); 
	}
	public Branch(String branchName) {
		this.branchName=branchName; 
		this.customer=new ArrayList<Customer>(); 
//		addCustomer(customerName, initialAmount);
	}
//	
	public boolean addCustomer(String customerName, double initialAmount) {
	    if(findCustomer(customerName)==null) { 
		   help.createCustomer(customerName, initialAmount);
		   return true; 
	    }
	    return false; 
	}
     public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existing = findCustomer(customerName);
        if(existing != null) {
        	existing.addTransaction(amount);
        	return true; 
        }
        return false; 
    	 
     }
     
    private Customer findCustomer(String name) {
      for(int i=0; i<this.customer.size(); i++) {
    	  if(this.customer.get(i).getName().equals(name)) {
    		  return this.customer.get(i) ; 
    	  }
      }
      return null; 
    }
     
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @return the customer
	 */
	public ArrayList<Customer> getCustomer() {
		return customer;
	}
	

}
