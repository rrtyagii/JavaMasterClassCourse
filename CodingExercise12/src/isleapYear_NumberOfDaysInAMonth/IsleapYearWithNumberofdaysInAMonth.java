package isleapYear_NumberOfDaysInAMonth;

import java.util.Scanner;

public class IsleapYearWithNumberofdaysInAMonth {
   public static void main(String[] args) {
	   
	    
	   int result=getDaysInMonth(2, 2020);
	   
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
   public static int getDaysInMonth(int month, int year) {
	   boolean leapYear=isLeapYear(year) ; 
	   if( month<1 || month>12 || year<1 || year>9999 ) {
		   return -1; 
	   }
	  if (leapYear!=true) 
	  {  
		  switch(month)
			{
			case 1: case 3: case 5 : case 7: case 8: case 10: case 12: 
			    return 31; 
			    
			    
			case 2:
				return 28;
				
			case 4: case 6: case 9 : case 11:
				return 30; 
				}
	 }
	  else 
	  {
		switch(month)
		{
		case 1: case 3: case 5 : case 7: case 8: case 10: case 12: 
		    return 31; 
		    
		    
		case 2:
			return 29;
			
		case 4: case 6: case 9 : case 11:
			return 30; 
			
			
		
		}
		
	  }
	  return month; 
   }
}
