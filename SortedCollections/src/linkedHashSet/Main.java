package linkedHashSet;

import java.util.Map;

public class Main {
	private static StockList stockList = new StockList(); 
	
   public static void main(String[] args) {
	 
	   StockItem temp = new StockItem ("Bread", 0.86, 100); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("Cake", 7.75, 15); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("Sugar", 3.45, 3); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("Juice", 12.00, 75); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("RCV", 86, 78); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("T-shirts", 7.58, 1000); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("Jeans", 13.99, 700); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("Eggs", 4.49, 600); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("Gulab Jamun", 4.78, 4524); 
	   stockList.addStock(temp); 
	   
	   temp = new StockItem ("Underwear", 7.25, 50000); 
	   stockList.addStock(temp); 
  
      System.out.println(stockList);
      System.out.println();
      Basket meriBasket = new Basket("Apni"); 
      sellItem(meriBasket, "Underwear", 5); 
      System.out.println(meriBasket);
      System.out.println();
      sellItem(meriBasket, "Jeans", 10);
      System.out.println(meriBasket);
      sellItem(meriBasket, "Underwear", 5); 
      System.out.println(meriBasket);
      sellItem(meriBasket, "Movies", 7); 
      System.out.println();
      System.out.println(meriBasket);
   }
   
   public static int sellItem(Basket basket, String item, int quantity) {
	   //retrieve the item from stock List 
	   StockItem stockItem = stockList.get(item); 
	   if(stockItem==null) {
		   System.out.println("Our apologies, we don't dont sell "+item);
	       return 0; 
	   }
	    if(stockList.reserveStock(item, quantity)!=0) {
	    	return basket.addToBasket(stockItem, quantity); 
	   }
	   return 0; 
   }
   
   public static int removeItem(Basket basket, String item, int quantity) {
	   //retrieve the item from stock List 
	   StockItem stockItem = stockList.get(item); 
	   if(stockItem==null) {
		   System.out.println("Our apologies, we don't dont sell "+item);
	       return 0; 
	   }
	    if(basket.removeFromBasket(stockItem, quantity)==quantity) {
	    	return stockList.unreserveStock(item, quantity); 
	   }
	   return 0; 
     }
   
   public static void checkOut(Basket basket) {
	   for(Map.Entry<StockItem, Integer> item: basket.item().entrySet()) {
		   stockList.sellStock(item.getKey().getName(), item.getValue()); 
	   }
	   basket.clearBasket(); 
   }
}