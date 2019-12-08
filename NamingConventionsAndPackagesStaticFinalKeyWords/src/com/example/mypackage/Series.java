package com.example.mypackage;
import java.util.*;
public class Series {
    public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter you desired number \n");
	  int desiredNumber = scan.nextInt(); 
	  System.out.println("the factorial is \t"+nFactorial(desiredNumber));
	  System.out.println();
	  System.out.println("the sum of all first "+desiredNumber+" numbers is \t"+nSum(desiredNumber));
	  System.out.println();
	  System.out.println("the fibonacci series is \t"+nFibonacci(desiredNumber));
   }
	
	 
	public static int nSum(int number) {
		int sum=0; 
		if(number<0) {
			return -1; 
		}
		else {
			for(int i=0; i<=number; i++) {
				sum+=i; 
			}
			return sum; 
		}
		 
	}
	
	public static int nFactorial(int number) {
		int factorial=1; 
		if(number<0) {
			return -1; 
		}
		else if(number == 0) {
			return 1; 
		}
		else {
			while(number!=0) {
				factorial*=number; 
				number--; 
				
			}
			return factorial; 
		}
	}
	
	public static int nFibonacci(int number) {
		int fibonacci=0; 
	
		if(number<0) {
			return -1; 
		}
		else if(number==0) {
			return fibonacci; 
		}
		else if(number==1) {
			return 1; 
		}
		else {
			int previousNumber=0; 
			int nextNumber=1; 
			for(int i=0; i<=number; ++i) {
				
			 fibonacci=previousNumber+nextNumber; 
			 previousNumber=nextNumber; 
			 nextNumber=fibonacci; 
			}
			return fibonacci; 
		}
	}
	
}
