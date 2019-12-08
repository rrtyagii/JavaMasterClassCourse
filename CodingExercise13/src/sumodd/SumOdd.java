package sumodd;

public class SumOdd {
	public static void main (String[] args) {
		
		int sumODD=sumOdd(100, 1000);
		System.out.println("The sum of all the odd numbers is " + sumODD);
	}
    public static boolean isOdd(int number){
    	if(number>0) {
    return	(number%2!=0)?true:false;
    	}
    	else 
    	{
    		return false;
    	}
    }
    
   public static int sumOdd(int start, int end) {
	    int sum=0;
	   if( (end>=start)&&(end>0) && (start>0) )
	   {	    
		   for(int i=start; i<=end; i++) 
		   {
			   isOdd(i);
			   if(isOdd(i)==true) { 
				   System.out.println("the odd number is " + i);
			      sum+=i ;  
			   }
		   }
	   
	 }
	   else {
		   return -1;
	   }
	  return sum;  
  }
    
}
