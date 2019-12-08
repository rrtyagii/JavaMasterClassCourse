package com;
import java.util.*; 
public class minimumElement {

/*    -Write a method called readIntegers() with a parameter called count that represents 
 *      how many integers the user needs to enter.
 
-The method needs to read from the console until all the numbers are entered, and then 
 return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the 
 minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() 
 with the count parameter. 

-Then call the findMin() method passing the array returned from the call to the 
  readIntegers() method.

-Finally, print the minimum element in the array.

Tips: 
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef
*/
	private static Scanner scan=new Scanner(System.in); 
  public static void main(String[] args) {
	System.out.println("enter the capacity of the array");
	int count=scan.nextInt() ; 
	//scan.nextLine(); 
	int[] myarray=readIntegers(count); 
	int minimum= findMin(myarray);
	System.out.println("the minimum value is "+minimum);
  }
  public static int[] readIntegers(int count) {
	 int[] value=new int[count];
	 
	 for(int i=0; i<value.length; i++) {
		 System.out.println("enter the "+i+" element of array. ");
	// scan.nextLine() ;   
	 value[i]=scan.nextInt() ;  
	  }
	  return value; 
  }
  public static int findMin(int[] array) {
	// int[] copyArray=new int[array.length]; 
	  int temp=Integer.MAX_VALUE ; 
 
		  for(int i=0; i<array.length; i++) {
			   int value=array[i]; 
			   
			  if(value<temp) {
				  temp=value; 
				  
			  }
	  }
		  return temp;
		    
  }
  
}