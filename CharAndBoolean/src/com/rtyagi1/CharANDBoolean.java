package com.rtyagi1;

public class CharANDBoolean {

	public static void main(String[] args) {
		/* can't put more than one letter one number or one special character
		 * in CHAR datatype. It will show an error. 
		 // TO INSERT A UNICODE CHARACTER YOU NEED TO PUT "\U"[smaller case] (THE 4 DIGIT 
		 * CODE OF THE CHARACTER YOU WANT TO PUT) IN SINGLE QUOTES.
		 */ 
		
		// WIDTH OF CHAR IS 16 (2BYTES)
		char mychar='4' ; 
        char mychartwo = '\u00A9' ;
        System.out.println(mychartwo);
        
        boolean myboolean = false ; 
        System.out.println(myboolean);
        
        char mycharthree = '\u00AE' ; 
        System.out.println(mycharthree);
        
	}

}
