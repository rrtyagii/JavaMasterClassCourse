package sumfirst;
//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//The method needs to find the first and the last digit of the 
//parameter number passed to the method, using a loop and return the 
//		sum of the first and the last digit of that number.
//
//If the number is negative then the method needs to return -1 
//		to indicate an invalid value.
//
//Example input/output
//
//* sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and
//		the last is 2 which gives us 2+2 and the sum is 4.
//
//* sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and 
//		the last is 7 which gives us 2+7 and the sum is 9.
//
//* sumFirstAndLastDigit(0); → should return 0, the first digit and 
//		the last digit is 0 since we only have 1 digit, which gives us 0+0 and 
//		the sum is 0.
//
//* sumFirstAndLastDigit(5); → should return 10, the first digit and 
//		the last digit is 5 since we only have 1 digit, which gives us 5+5 
//		and the sum is 10.
//
//* sumFirstAndLastDigit(-10); → should return -1, since the parameter
//		is negative and needs to be positive.
//
//
//NOTE: The method sumFirstAndLastDigit needs to be defined as
//public static like we have been doing so far in the course.
//
//NOTE: Do not add a  main method to solution code.

public class SumFirstLast {
	 public static void main(String[] args) {
		 int result= sumFirstAndLastDigit(-10); 
		 System.out.println("result is " + result);
	 }
	 
	 public static int sumFirstAndLastDigit(int number) {
		 
		 int lastDigit; 
		 int sum=0;
		 int firstNumber; 
		 if(number<0) {
			 System.out.println("Wrong entry buddy");
			 return -1; 
		 }
		 
		 else if(number<=9 && number!=0){
			 sum=number+number; 
		 }
		 else {
			  lastDigit=number%10;
		        System.out.println("Last Digit " + lastDigit);
		       while(number>=10) {
		    	number=number/10; 
		       System.out.println("number is " + number);
		       }
		       firstNumber=number;
		       sum=lastDigit+firstNumber; 
		       System.out.println("sum is "  + sum);
		      
		 }
		 
		 return sum; 
	 }
	 

}
