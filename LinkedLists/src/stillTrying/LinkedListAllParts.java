package stillTrying;

public class LinkedListAllParts {
 
	//this class in tim's program was named as customer
	private String name; 
	private double balance;
	
	public LinkedListAllParts(String name, double balance) {
		super(); 
		setBalance(balance);
		setName(name);
	}
	
	public void setName(String name) {
		if( (name.equals(this.name) ) || name==null) {
			System.out.println("can't update the name. Invalid input or same input as existing.");
		}
		else {
			this.name=name; 
		}
		
	}
	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("Can't update balance. Invalid input or input being 0");
		}
		else {
			this.balance=balance; 
		}
	}
	
	public String getName() {
		return this.name; 
	}
	
	public double getBalance() {
		return this.balance; 
	}
	
	
}
