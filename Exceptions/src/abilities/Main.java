package abilities;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in) ; 
	   System.out.println("Please enter the integer");
		int x=s.nextInt();
		System.out.println("Please enter the integer");
		int y=s.nextInt();
	divideEAPL(x, y)	; 
	divideLBYL(x, y); 
	
}
   private static int divideLBYL(int x, int y) {
	   if(y!=0) {
		   return x/y; 
	   }
	   return 0 ; 
   } 
   
   private static int divideEAPL(int x, int y) {
	   try {
		   return x/y; 
	   }catch(ArithmeticException e) {
		   return 0; 
	   }
	   
   }

}
