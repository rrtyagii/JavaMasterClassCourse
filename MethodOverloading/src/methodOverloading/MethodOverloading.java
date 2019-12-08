package methodOverloading;

public class MethodOverloading {
	public static void main (String[] args) {
	calcFeetAndInchesToCentimeters(45.52) ; 
	calcFeetAndInchesToCentimeters(6.0, 0.0);
	//calcFeetAndInchesToCentimeters(42) ; 
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double centimeter = -1; 
		if( (feet>=0) && (inches>=0 && inches<=12 ) ) {
			// 1 inch = 2.54cm and 1 feet = 12 inches
			centimeter = (feet*12 + inches)*2.54; 
			System.out.println("Feet and inches in centimeter is " + centimeter);
		    return centimeter; 
		}
		
		else {
			System.out.println("testing for else") ;
			 return centimeter; 
		}
	}
  
	public static double calcFeetAndInchesToCentimeters(double inches) {
		double feeet =-1 ; 
		if(inches>=0)
		{
			// 1 inch = 2.54cm and 1 feet = 12 inches
		   feeet=(inches)/12 ;
		   System.out.println("number of feet is " + feeet);
		    return feeet;  
		}
		else {
			return feeet;
		}
		
	}
	
/*	public static boolean calcFeetAndInchesToCentimeters( int inches) {
		boolean feeet = false ; 
		if(inches>=0)
		{
			// 1 inch = 2.54cm and 1 feet = 12 inches
		  //  feeet=(inches)/12 ;
		   System.out.println("number of feet is " + feeet);
		    return feeet;  
		}
		else {
			return feeet;
		}
		
	}
	*/
}
