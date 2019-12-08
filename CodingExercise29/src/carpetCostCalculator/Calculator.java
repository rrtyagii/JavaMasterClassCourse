package carpetCostCalculator;

public class Calculator {
     private Floor floor; 
     private Carpet carpet;
     
     public Calculator(Floor floor, Carpet carpet) {
    	 this.carpet=carpet;
    	 this.floor=floor; 
    	 System.out.println("parameterized constructor of class calculator is called");
     }
     public double getTotalCost() {
    	 double totalCost=floor.getArea()*carpet.getCost(); 
    	 return totalCost;
     }
     
}
