package areaCalc;

public class AreaCalculator {
 private static final double PI=3.14159 ; 
 public static void main (String [] args) {
	double resultCir=area(5.0) ;  
	System.out.println("The area of the cirlce is " + resultCir);
	double resultRec=area(-1.0, 4.0) ; 
	System.out.println("The area of the radius is " + resultRec);
	  
  }
  public static double area(double radius) {
	  if(radius<0)
	  {
		  return -1; 
	  }
	  double area=PI*radius*radius;
      return area ; 
  }
  public static double area(double x, double y) {
	   if ( x<0 || y<0) 
	   {
		   return -1 ;
	   }
	   double area=x*y;
	   return area; 
    }
}
