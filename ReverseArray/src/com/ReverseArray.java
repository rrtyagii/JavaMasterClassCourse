package com;

import java.util.*;



public class ReverseArray {
	
	private static Scanner scan=new Scanner(System.in) ;
//	-Write a method called reverse() with an int array as a parameter.
//
//	-The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//	-In main() test the reverse() method and print the array both reversed and non-reversed.
//
//	-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//	-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//	Tip:
//		-Create a new console project with the name eReverseArrayChallengef
	
	public static void main(String[] args) {
		System.out.println("enter the capacity of your desired array");
		int capacity=scan.nextInt(); 
		int[] myArray=new int[capacity]; 
		
		for(int i=0; i<myArray.length; i++) {
		System.out.println("enter the element "+i+" of array.");
		myArray[i]=scan.nextInt(); 
		}
		
		System.out.println("the un-reversed array is "+Arrays.toString(myArray));
		reverse(myArray);
	}

	public static void reverse(int[] array) {
       int temp; 
       //int maxIndex=array.length-1; 
      for(int i=0; i<(array.length)/2; i++) {
    	  temp=array[i];
          array[i] =array[(array.length-1)-i]; 
          array[(array.length-1)-i]=temp;
          
      }
      System.out.println("the reverse array is "+Arrays.toString(array));
    
	}
}
