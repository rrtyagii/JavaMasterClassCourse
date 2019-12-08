package codingExercise15;

//Write a method named getEvenDigitSum with one parameter of type int called number.
//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//
//* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//
//* getEvenDigitSum(-22); → should return -1 since the number is negative
//
//
//NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.

public class GetDigitSum {
	public static void main(String[] args) {
		int result=getEvenDigitSum(-22) ; 
		System.out.println("result is " + result);
	}
	public static int getEvenDigitSum(int number) {
		int nextNumber; 
		int sum=0;
		
		if(number<0) {
			System.out.println("This is wrong Inputs");
			return -1; 
		}
		else {
			while(number>0) {
			nextNumber=number%10;
			
			System.out.println("the next number is " + number );
			if(nextNumber%2==0) {
				sum+=nextNumber; 
			}
			number/=10; 
			
			}
		}
		return sum; 
	}

}
