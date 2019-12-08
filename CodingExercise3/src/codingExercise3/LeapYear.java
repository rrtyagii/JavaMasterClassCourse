package codingExercise3;

public class LeapYear {
	public static void main (String[] args) {
		isLeapYear(2000) ;
	}
	public static boolean isLeapYear(int year) {
		boolean leapYear=false; 
	
		if(year>=1 && year<=9999)
		{
			if( ( ( year%4==0 ) && (year%100!=0) ) || (year%400==0) ) 
			{ leapYear=true; 
			   System.out.println("THIS IS A LEAP YEAR ");
	           }
			else {
				leapYear=false;
				System.out.println("Not a leap year");
			}
		}
		else {
			System.out.println("Not a valid year");
			System.out.println(leapYear);
		     }
	 	
		
		return leapYear;
}
}