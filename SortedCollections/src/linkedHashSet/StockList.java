package linkedHashSet;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class StockList {
	
	private final Map<String, StockItem> list;
	 
	
	public StockList() {
		this.list=new HashMap<>(); 
	}
	
	
	public int addStock(StockItem item) {
		if(item != null) {
			//check if already have quantities of this item
			StockItem inStock = list.getOrDefault(item.getName(), item); 
		// if there are already stock on this item, adjust the quantity. 
		  if(inStock!=item) {
			  item.adjustStock(inStock.availableQuantity());
		  }
			list.put(item.getName(),item);   
			return item.availableQuantity(); 
		}
		return 0;  
	}
	
	
	
	public int sellStock(String item, int quantity) {
		StockItem inStock = list.get(item); 
		if((inStock!=null) && (quantity>0)) {
			inStock.finalisedStock(quantity); 
		}
		return 0; 
//		StockItem inStock = list.getOrDefault(item, null); 
//		if( (inStock!=null) && (inStock.availableQuantity()>=quantity) && (quantity>0)) {
//			inStock.adjustStock(-quantity);
//			return quantity; 
//		}
//		return 0; 
	}
	
	
	public int reserveStock(String item, int quantity) {
		StockItem inStock = list.get(item); 
		if((inStock!=null) &&(quantity>0)) {
			return inStock.reserveStock(quantity); 
		}
		return 0; 
	}
	
	
	public int unreserveStock(String item, int quantity) {
		StockItem inStock = list.get(item); 
		if((inStock!=null)&&(quantity>0)) {
			return inStock.unreservedStock(quantity); 
		}
		return 0; 
	}
	
	public StockItem get(String key) {
		return list.get(key); 
	}
	
	public Map<String, StockItem>Items(){
		return Collections.unmodifiableMap(list); 
	}
	
	@Override
	public String toString() {
		String s ="\nStock List\n"; 
		double totalCost=0.0; 
		for(Map.Entry<String , StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();
			
			double itemValue = stockItem.getPrice()*stockItem.availableQuantity(); 
			
			s=s+stockItem+". There are "+stockItem.availableQuantity()+" in stock. Value of item: "; 
			s=s+String.format("%.2f", itemValue)+"\n"; 
			totalCost+=itemValue; 
		}
		
		return s+" Total Stock value "+String.format("%.2f", totalCost); 
	}

}
