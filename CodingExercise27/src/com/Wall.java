package com;

public class Wall {
   double width, height;
   public Wall() {
	   System.out.println("Calling no arguments constructor");
   }

  public Wall(double width, double height) {
	  System.out.println("Calling parameterized constructor");
	if(width<0) {
		width=0; 
	}
	if(height<0) {
		height=0; 
	}
	this.width = width;
	this.height = height;
 }
    public double getArea() {
        double area=this.height*this.width ; 
        return area; 
    }
  
public double getWidth() {
	return width;
}

public void setWidth(double width) {
	if(width<0) {
		width=0; 
	}
	this.width = width;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	if(height<0) {
		height=0; 
	}
	this.height = height;
} 
  
 	
}
