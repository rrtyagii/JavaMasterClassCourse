package com;

import java.util.Arrays;

public class Main {
	// primitive date types are value types, in other words they hold a value. 
	// String and array are reference types. 
	
	public static void main(String[] args) {
		int myIntVale=10; 
		int anotherIntVal=myIntVale; 
		
		System.out.println("myIntValue "+myIntVale);
		System.out.println("anotherIntValue "+anotherIntVal);
		
		anotherIntVal++; 
		
		System.out.println("myIntValue "+myIntVale);
		System.out.println("anotherIntValue "+anotherIntVal);
// these are value types. so when we created an int , a single space in memory is allocated
// to store the value and that variable directly holds the value. 
		
		int[] myArray=new int[5];
		int[] anotherArray=myArray; 
/*
   
now reference types like a raised or classes work differently you have already discussed
what a reference is how it works and the new operator so whenever you see the new
keyword that means that we're creating a new object.

now arrays again are reference types so what does this mean again? all reference types
are used by a reference. reference holds of reference or an address to the object but not 
the object itself  

in other words the variable here myArray holds a reference or address to an array in memory.
		 
With reference types we're using a reference to control the object in memory so we can access 
the object directly 

so a reference is like an address some of some object in memory in this case again my int 
array is actually a reference to the array in memory. 

 */		
		System.out.println("myArray is "+Arrays.toString(myArray));
		System.out.println("anotherArray is "+Arrays.toString(anotherArray));
		
		anotherArray[0]=1; 
		System.out.println("after change myArray is "+Arrays.toString(myArray));
		System.out.println("after change anotherArray is "+Arrays.toString(anotherArray));
/*
  they both were actually changed so both variables in other words again a references to an
array and because we've updated another array to one it automatically updated the other array
because both variables are referencing the same array in memory so there's only one copy
of the array that both variables are pointing to and that's why the array has been updated 
as it has now this might look a bit weird but that's how references work  and it's because 
reference types represent the address of the variable rather than the data itself
		
 */
		

		
		
	}

}
