  package numbahPalindrome;
  public class NumberPalindrome {
         public static void main (String[] args) {
        	 boolean result;
        	 result=isPalindrome(101) ; 
        	 System.out.println(result);
         }
         public static boolean isPalindrome(int number) {
        	 boolean isPalinn=false; 
         if (number==0) {
        	 System.out.println("put other number than zero");
        	 return isPalinn; 
           }
         else {
        	 int reverse=0; 
        	 int lastDigit; 
        	 int original=number; 
        	 
        	 while(number!=0) {
        	 lastDigit=number%10; 
             reverse*=10 ; 
             reverse=reverse+lastDigit;
             number/=10;
             //break;
             System.out.println("reverse is " +reverse);
             System.out.println("number is " + number);
        	 }
          if(reverse==original) { isPalinn=true; return isPalinn ;  }
          else {    isPalinn=false; return isPalinn; }
         }
          
         }
//         public static boolean isPalindrome(int number) {
//        	 
//             int reversedInt = 0;
//             int remainder = 0;
//             int originalInt;
//      
//             originalInt = number;
//      
//             while (number != 0) {
//                 remainder = number % 10;
//                 reversedInt = reversedInt * 10 + remainder;
//                 number /= 10;
//             }
//             if (originalInt == reversedInt) {
//                 System.out.println(originalInt + " is absolutely a palindrome");
//                 return true;
//             }
//             System.out.println(originalInt + " is definitely not a palindrome");
//             System.out.println();
//             return false;
//         }
   }
