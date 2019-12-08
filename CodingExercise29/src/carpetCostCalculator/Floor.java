package carpetCostCalculator;

public class Floor {
	private double width, length; 
	
	public Floor(double width, double length) {
		this.width=width;
		this.length=length;
		System.out.println("Calling up the parameterized constructor of class Floor");
	} 
	public void setWidth(double width) {
		if(width<0) {
			width=0; 
		}
		this.width=width; 
	}
	
	public void setHeight(double length) {
		if(length<0) {
			length=0; 
		}
		this.length=length; 
	}
	public double getArea() {
		return (this.width*this.length) ; 
	}

}
