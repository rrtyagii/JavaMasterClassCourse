package numbah2words;

public class NumberToWords {
	public static void main(String[] args) {
//		int length=getDigitCount(0);
//		System.out.println("the number of digit(s) is(are) "+length);
//		
//		int length1=getDigitCount(123);
//		System.out.println("the number of digit(s) is(are) "+length1);
//		
//		int length2=getDigitCount(-12);
//		System.out.println("the number of digit(s) is(are) "+length2);
//		
//		int length3=getDigitCount(5200);
//		System.out.println("the number of digit(s) is(are) "+length3);
//		
		
//		int reverse=reverse(-121);
//		System.out.println("The reverse of this number is "+reverse);
//		
//		int reverse1=reverse(1212);
//		System.out.println("The reverse of this number is "+reverse1);
//		
//		int reverse2=reverse(1234);
//		System.out.println("The reverse of this number is "+reverse2);
//		
//		int reverse3=reverse(100);
//		System.out.println("The reverse of this number is "+reverse3);
//		
		
		numberToWords(-222);
		System.out.println("****");
//		numberToWords(1010);
//		System.out.println("****");
//		numberToWords(1000);
//		System.out.println("****");
//		numberToWords(-12);
//		
		
		
	}
	public static void numberToWords(int number) {
		if(number<0) {
			System.out.println("Invalid Value");
		}
		
		else if(number==0){
			System.out.println("Zero");
		}
		
		else {
			    	 		
			int numLen=getDigitCount(number);
			int reverseLen=getDigitCount(reverse(number)); 
			int numToPrint=reverse(number);
			
			  int lastDigit;
			
			while(numToPrint>0) {
				
                lastDigit=numToPrint%10; 
                numToPrint/=10;
                
                switch(lastDigit) {
		             case 0: 
		           		 System.out.println("Zero");
		           		 break;
		           	 case 1:
		           		 System.out.println("One");
		           		 break;
		           	 case 2:
		           		 System.out.println("Two");
		           		 break;
		           	 case 3:
		           		 System.out.println("Three");
		           		 break;
		           	 case 4:
		           		 System.out.println("Four");
		           		 break; 
		           	 case 5:
		           		 System.out.println("Five");
		           		 break;
		           	 case 6: 
		           		 System.out.println("Six");
		           		 break; 
		           	 case 7:
		           		 System.out.println("Seven");
		           		 break;
		           	 case 8:
		           		 System.out.println("Eight");
		           		 break;
		           	 case 9:
		           		 System.out.println("Nine");
		           		 break;
		                default:
		               	 System.out.println("Other");
		               	 break;          }
			}
			if(numLen>reverseLen) {
				int amountOfZeroes=numLen-reverseLen ; 
				do {
					System.out.println("Zero");
					amountOfZeroes-- ;
				}while(amountOfZeroes>0);
			                                 } 
			
		}
		
	}
	public static int reverse(int number) {
		int reverse=0; 
		int original=number;
		
		if(number<0) {
			number=number*(-1) ; 
			 
			 
		}
		
		 
				int last_Digit; 
				while(number>0) {
					last_Digit=number%10; 
					reverse*=10; 
					reverse+=last_Digit; 
					number/=10; 
				}
		    if(original>0) {
		    	return reverse; 
		    	
		    }
		    else {
		    	return reverse*(-1); 
		    }
		
		
		 
    }
	
	public static int getDigitCount(int number) {
		if(number<0) {
			return -1; 
		}
		else {
			int count=0;
			int lastDigit; 
			
			if(number==0) {
				count++; 
			}
			 
			while(number>0) {
                lastDigit=number%10; 
                 count++;
                 number/=10; 
			}
			return count; 
		}
	}
	
	
}
