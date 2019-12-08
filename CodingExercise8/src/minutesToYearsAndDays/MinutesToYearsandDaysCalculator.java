package minutesToYearsAndDays;

public class MinutesToYearsandDaysCalculator {
	public static void main(String[] args) {
     printYearsAndDays(-525600);	
    }
    public static void printYearsAndDays(long minutes) {
    	if(minutes<0) {
    		System.out.println("Invalid Value");
    	}
    	else
    	{
    	// hour=60 minutes
    	// 1 day = 24 hours
    	// 1 years = 365 days
    	long year = minutes/(365*24*60)  ; 
    	long days = (minutes%525600)/1440 ; 
     System.out.println(minutes + " min " + "= " + year + " y" +" and " +days+" d" );
       	
    	}
    	
    }
    
}
