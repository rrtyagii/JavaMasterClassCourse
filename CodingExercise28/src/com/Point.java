package com;

public class Point {
	private int x,y;
 
	public Point() {
		this(0,0) ;
		System.out.println("Calling the default constructor");
		 
	 } 

	public Point(int x, int y) {
		System.out.println("Calling the parameterized constructor");
		this.x = x;
		this.y = y;
	 }

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}  
  /*
         d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
	
   */
	  public double distance() {
	        return distance(0,0);
	    }
      public double distance(int x, int y ) {
    	  return Math.sqrt( (this.x-x)*(this.x-x)+(this.y-y)*(this.y-y) ) ; 
      }
      public double distance(Point p ) {
    	  return distance(p.x, p.y) ; 
      }
}
