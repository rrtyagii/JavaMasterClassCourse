package linkedHashSet;

public class StockItem implements Comparable<StockItem> {
   private final String name; 
   private double price; 
   private int quantityInStock, reserved; 
   
    public StockItem(String name, double price) {
		   this.name=name; 
		   setPrice(price); 
		   this.quantityInStock=0; 
	}
	 
    
    public StockItem(String name, double price, int quantityStock) {
 	   this.name=name; 
 	   setPrice(price); 
 	   this.quantityInStock=quantityStock; 
    }

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price>0.0) { 
		this.price = price; }
		else {
			System.out.println("can't do it bro");
		}
	}
	
	public int availableQuantity() {
		return quantityInStock-reserved;
	}
	
	public void setQuantityStock(int quantityStock) {
		this.quantityInStock = quantityStock;
	}
	
	public String getName() {
		return name;
	}
	
	public void adjustStock(int quantity) {
		int newQuantity = this.quantityInStock+quantity; 
		if(newQuantity>0) {
			this.quantityInStock=newQuantity; 
		}
	}
	
	public int reserveStock(int quantity) {
		if(quantity<=availableQuantity()) { //Use the method not the field; 
			this.reserved+=quantity; 
			return quantity; 
		}
		return 0; 
	}
	
	public int unreservedStock(int quantity) {
		if(quantity<=this.reserved) {
			this.reserved-=quantity;
		    return quantity; 	
		}
		return 0; 
	}
	 
	public int finalisedStock(int quantity) {
		if(quantity<=reserved) {
			quantityInStock-=quantity; 
			reserved-=quantity;  
			return quantity; 
		}
		return 0; 
	}
	 
	@Override
	public boolean equals(Object obj) {
		System.out.println("Now I'm entering in the StockItem.equals method");
		if(obj == this) {
			return true; 
		} 
		if( (obj ==null)|| (obj.getClass() !=this.getClass()) ) {
			return false; 
		}
		
		String objName = ((StockItem) obj).getName(); 
		return this.name.equals(objName); 
	}
   
	@Override
	public int hashCode() {
		return this.name.hashCode()+108; 
	}
    
	@Override
	public int compareTo(StockItem stock) {
//		System.out.println("Now I'm entering StockItem.compareTo method");
		if(this==stock) {
			return 0; 
		}
		if(stock!=null) {
			return this.name.compareTo(stock.getName()); 
		}
		throw new NullPointerException(); 
	}
	
	@Override 
	public String toString() {
		return this.name +" : price "+ this.price+" . Reserved: "+this.reserved;
		
	}
	
	
}
