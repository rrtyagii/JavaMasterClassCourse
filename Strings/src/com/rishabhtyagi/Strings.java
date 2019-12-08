package com.rishabhtyagi;

public class Strings {

 public static void main (String [] args) {
  //byte
	 //int 
	 //long
	 // short
	 //float
	 //double
	 //char
	 //boolean
	 
	/* Strings , ninth data type, sequence of characters
	 * we use double quotes ( " " ) here unlike (' ') 
	 * in char  
	 */ 
 
	String mystring ="THIS IS MY FIRST JAVA STRING"; 
	System.out.println("mystring is equal to " + mystring) ;
	mystring = mystring + " , and this is more" ; 
	System.out.println("mystring is equal to " + mystring) ;
 
	String numberstring= "258.45" ;
	System.out.println(numberstring) ; 
	numberstring = numberstring + "48.95" ;  
	System.out.println(numberstring) ;    
 
    int myint = 50; 
    String laststring="250" ; 
    laststring= laststring + myint ; 
    System.out.println(laststring) ; 
  
 
 
 }

}