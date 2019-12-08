package com;

public class SpeedConverter {

	public static void main(String[] args) {
//		long result=toMilesPerHours(1.5); 
//		System.out.println(result);
//		System.out.println("*******");
//		long result1=toMilesPerHours(10.25); 
//		System.out.println(result1);
//		System.out.println("*******");
//		long result2=toMilesPerHours(-5.6); 
//		System.out.println(result2);
//		System.out.println("*******");
//		long result3=toMilesPerHours(25.42); 
//		System.out.println(result3);
//		System.out.println("*******");
//		long result4=toMilesPerHours(75.114); 
//		System.out.println(result4);
//		
		printConversion(1.5);
		System.out.println("*******");
		printConversion(10.25);
		System.out.println("*******");
		printConversion(-5.6);
		System.out.println("*******");
		printConversion(25.42);
		System.out.println("*******");
		printConversion(75.114);
		
	}
	public static long toMilesPerHours(double kilometersPerHour) {
		if(kilometersPerHour<0) {
			return -1; 
		}
// NOTE: 1 mile per hour is 1.609 kilometers per hour
		else {
			return (long) (Math.round( (kilometersPerHour/1.609) ) );  
		}
	}
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour<0) {
			System.out.println("Invalid Value");
		}
		else {
		     long milesPerHours=toMilesPerHours(kilometersPerHour) ;  
		   System.out.println(kilometersPerHour+" km/h"+" = "+milesPerHours+" mi/h") ;
		}
	}
}
