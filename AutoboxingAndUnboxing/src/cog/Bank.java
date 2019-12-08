package cog;

import java.util.*;

public class Bank {
	 private Branch branch ; 	

	// Bank:
	// Add a new branch
	// Add a customer to that branch with initial transaction
	// Add a transaction for an existing customer for that branch
	// Show a list of customers for a particular branch and optionally a list
	// of their transactions

	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		branches = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName) {
		if (this.branches.contains(branchName)) {
			System.out.println("already exists");
			return false;
		}
		this.branches.add(new Branch(branchName));
		System.out.println(branchName + " has been added");
		return true;
	}

	public boolean addCustomer(String branchName, String customerNmae, double initialAmount) {
       
        if(this.branches.contains(branchName) == true) {
               	return branch.addCustomer(customerNmae, initialAmount); 
               	 
        }
        return false; 
	}
	 
	public boolean addCustomerTransaction(String branchName, String customerNmae, double initialAmount) {
	 if(this.branches.contains(branchName))	{
		 return branch.addCustomerTransaction(customerNmae, initialAmount); 
	 }
	 return false; 
	}
	
    private Branch findBranch(String name) {
        for(int i=0; i<this.branches.size(); i++) {
      	  if(this.branches.get(i).getBranchName().equals(name)) {
      		  return this.branches.get(i) ; 
      	  }
        }
        return null; 
      }
    
    public boolean listCustomer(String branchName, boolean showTransaction) {
    	if(this.branches.contains(branchName)) {
    		System.out.println("Customer details for branch "+branch.getBranchName() );
    		
    		ArrayList<Customer> branchCustomers = branch.getCustomer(); 
    		
    		for(int i=0; i<branchCustomers.size(); i++) {
    			Customer branchCustomer= branchCustomers.get(i); 
    			System.out.println("Customer: "+branchCustomer.getName()+" [ " +i+" ]");
    			
    			if(showTransaction) {
    				System.out.println("Transactions");
    				ArrayList<Double> transaction = branchCustomer.getTransactions() ; 
    				
    			  for(int j=0; j<transaction.size(); j++) {
    				  System.out.println("[" + (j+1)+ " ] "+ "Amount " + transaction.get(j) ) ;
    			  }
    				  
    			}
    		}
    		
    		return true; 
    	}
    	else {
    		return false; 
    	}
    
    }
}
