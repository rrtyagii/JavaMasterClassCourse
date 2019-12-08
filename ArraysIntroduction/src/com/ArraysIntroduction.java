package com;
import java.util.*;

public class ArraysIntroduction {
	private static Scanner scan=new Scanner(System.in) ; 

// a data structure that allows you to store sequence of of value that are all of same 
//datatypes.
	public static void main(String[] args) {
//		int[] myIntArray=new int[10]; 
//		myIntArray[5]=50; 
//		double[] myDoubleArray=new double[10]; 
//		System.out.println("the value in 6th place in myIntArray is "+myIntArray[5]);
//		for(int i=0; i<myDoubleArray.length; i++) {
//		myDoubleArray[i]=i*5; 
//		}
//		for(int i=0; i<myDoubleArray.length; i++) {
//			System.out.println("the value in "+ (i) +" place in myDoubleArray is "+myDoubleArray[i]);	
//			
//		}
		int myIntegers[]=getIntegers(5); 
		
		for(int i=0; i<myIntegers.length; i++) {
			System.out.println("element "+i+", typed value was "+myIntegers[i] );
		}
		System.out.println("the average is "+average(myIntegers));
		
		
	}
	public static int[] getIntegers(int number) {
		System.out.println("enter "+number+" integer values. \r");
		int[] value=new int[number]; 
		
		for(int i=0; i<value.length; i++) {
			value[i]=scan.nextInt(); 
		}
		return value; 
	}
	
	public static double average(int[] array) {
		int sumTotal=0;
		
		for(int i=0; i<array.length; i++) {
			sumTotal+=array[i]; 
		}
		return (double)sumTotal/array.length; 
	}
	
}
