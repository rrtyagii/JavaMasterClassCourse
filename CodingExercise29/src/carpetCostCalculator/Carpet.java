package carpetCostCalculator;

public class Carpet {
   private double cost; 
   
   public Carpet(double cost) {
	 if(cost<0) {
		 cost=0; 
	   }
	   this.cost=cost; 
	System.out.println("parameterized constructor of class Carpet is called");
   }
   public double getCost() {
	   return this.cost;
   }
   
}
