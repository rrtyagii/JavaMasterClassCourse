package codingExShared;

//Write a method named hasSharedDigit with two parameters of type int. 
//
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.

public class SharedDigit {
   public static void main(String[] args) {
	   boolean result=hasSharedDigit(15, 55) ; 
	   System.out.println("the result is " + result);
	   
   }
   public static boolean hasSharedDigit(int numb1 , int numb2) {
	    if(numb1<10 || numb1>99 || numb2<10 || numb2>99) {
	    	System.out.println("This is not working my man");
	    	return false; 
	    }
	    
	    else { 	    	
	    		int numb1FirstDigit=numb1%10; 
	    		System.out.println("The first digit of first number is " + numb1FirstDigit);
	    		int numb1SecondDigit=numb1/10; 
	    		System.out.println("The second digit of first number is "+numb1SecondDigit);
	    		int numb2FirstDigit=numb2%10; 
	    		System.out.println("The first digit of the second number is "+numb2FirstDigit);
	    		int numb2SecondDigit=numb2/10;
	    		System.out.println("The second digit of the second number is "+numb2SecondDigit);
	    	 
	    		if(numb1FirstDigit==numb2FirstDigit) {
	    			System.out.println(numb1FirstDigit + " is equal to " + numb2FirstDigit);
	    		    return true; 
	    		}
	    		else if(numb1FirstDigit==numb2SecondDigit) {
	    			System.out.println(numb1FirstDigit + " is equal to " + numb2SecondDigit);
	    			return true; 
	    		}
	    	    
	    		else if(numb1SecondDigit==numb2FirstDigit) {
	    			System.out.println(numb1SecondDigit+" is equal to "+numb2FirstDigit);
	    			return true;
	    		}
	    		
	    		else if(numb1SecondDigit==numb2SecondDigit) {
	    			System.out.println(numb1SecondDigit+" is equal to "+numb2SecondDigit);
	    		    return true; 
	    		}
	    		else {
	    			System.out.println("Nothing is common");
	    			return false; 
	    		}
	    	
	    	}
	    }
}
   

