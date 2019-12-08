package com.rtyagi1;

public class FLOAT_DOUBLE {

	public static void main (String [] args) {
	//WIDTH OF AN INTEGER IS 32 ( 4 BYTES).
	int myintvalue = 5 ;
	int mynewintvalue = 5/3 ;
	//WIDTH OF A FLOAT IS 32 ( 4 BYTES).
	float myfloatvalue =5f/3f; 
   //WITDH OF A DOUBLE IS 64 (8 BYTES).
	double mydoublevalue = 5d/3d ; 
	System.out.println("mynewintvalue = " + mynewintvalue) ;
	System.out.println("\n") ;
	System.out.println("myfloatvalue = " + myfloatvalue);
	System.out.println("\n") ; 
	System.out.println("myintvalue = " + myintvalue) ; 
	System.out.println("\n") ; 
	System.out.println("mydoublevalue = " + mydoublevalue); 
	
	
	//CHALLENGE
	// 1 pound is equal to 0.45359237 kilograms
	double pounds = 200d;
	double kilograms = pounds * 0.45359237d ;
	System.out.println("pounds in kilograms = " + kilograms);
	
	
	
}
}
