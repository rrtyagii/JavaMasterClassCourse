//Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//The method should not return any value (hint: void)
//
//		Using a switch statement print Sunday, Monday...Saturday if the int parameter day is 0, 1....6 respectively, otherwise it should print Invalid day.
//
//		Bonus: 
//			Write a second solution using if then else, instead of using switch.
//			Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh



package daysOfTheWeek;

public class Challenge {
              public static void main (String[] args) {
            	   printDayOfTheWeek(7);
            	   System.out.println("\n");
            	   printdayOfTheWeek(0);
              }
            public static void printDayOfTheWeek(int day)  {
            	switch (day) {
	            	case 0:
	            		System.out.println("this could be SUNDAY");
	            		break;
	            	case 1:
	            		System.out.println("This could be MONDAY");
	            		break;
	            	case 2:
	            		System.out.println("This could be TUESDAY");
	            		break;
	            	case 3:
	            		System.out.println("This coudl be WEDNESDAY");
	            		break;
	            	case 4:
	            		System.out.println("This could be THURSDAY");
	            		break;
	            	case 5:
	            		System.out.println("This could be FRIDAY");
	            		break;
	            	case 6:
	            		System.out.println("This could be SATURDAY");
	            		break;
	            		
	            	default:
	            		System.out.println("wrong input");
	            		break;
	            	}
            	 
            }
            public static void printdayOfTheWeek(long day) {
            	if(day<0 || day>6) {
            		System.out.println("INVALD INPUT" ); }
            		else {
            			if(day==0) {
            				System.out.println("This is SUNDAY");
            			 }
            			else if(day==1) {
            			System.out.println("This is MONDAY");	
            			}
            			else if (day==2) {
            				System.out.println("This is TUESDAY");
            			}
            			else if(day==3)
            			{
            				System.out.println("This is WEDNESDAY");
            				
            			}
            			else if (day==4) 
            			{
            				System.out.println("This is THURSDAY");
            			}
            			else if (day==5) 
            			{
            				System.out.println("This is FRIDAY");
            				
            	    	}
            			else {
            				System.out.println("This is SATURDAY");
            			}
            	}
       		 
       	 }
}
