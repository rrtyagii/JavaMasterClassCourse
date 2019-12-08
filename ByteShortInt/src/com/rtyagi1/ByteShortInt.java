package com.rtyagi1;

public class ByteShortInt {

public static void main(String[] args) {	
	 //THE INT HAS A WIDTH OF 32
	int myminvalue = -2_147_483_648;
	int mymaxvalue = 2_147_483_647;
	int mytotal = (myminvalue/2) ; 
	
	//BYTE HAS A WIDTH OF 8
	byte MybyteVALUE = - 128 ; 
	byte mymaxbytevalue = 127 ;
	byte myTotal = (byte) (MybyteVALUE/2) ;
	
	//SHORT HAS A WIDTH OF 16
	short myshortvalue = -32768 ;
	short mylargeshortvalue = 32767 ;
	
	//LONG HAS A WIDTH OF 64
/*  WE PUT "L" OR "l" AFTER THE NUMBER 
	WE WANT TO ASSIGN THROUGH A 
	LONG DATA TYPE. THIS HELPS 
	THE COMPILER TO UNDERSTAND THAT THIS IS LONG VALUE */
	long mySMALLESTlongvalue = -9_223_372_036_854_775_807L ;
	long myLARGESTlongvalue = 9_223_372_036_854_775_806L ;

	//CHALLENGE
	
	byte bytevariable = 10 ;
	short shortvariable  = 20;
	int intvariable = 50;
	long longvariable = 50000 + 10 *(bytevariable + shortvariable +intvariable )  ;
	short shortvlaue = (short) (1000 + 10 *(bytevariable + shortvariable +intvariable ) ) ;
	
	System.out.println("long Value=" + longvariable); 
	System.out.println("short Value=" + shortvlaue); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}