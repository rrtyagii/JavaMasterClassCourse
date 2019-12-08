package com.nonu;

 public class Keywords_Codeblocks {
	public static void main (String[] args) {
		 boolean gameover=true; 
		 int score=5;
		 int levelcomplete=5;
		 int bonus=100 ; 
		 
	    /*  if(score==5000 && score>1000)
	    	   { System.out.println("your score is less than 5000" + 
	    	                " but greater than 1000");
	    }
	       else
	       {
	    	   System.out.println("we just got here !");
	       }
	       System.out.println("\n") ;
	       System.out.println("this was executed") ;
		*/
		
		 
		if (gameover)  
		 
		 {
			 int finalscore=score+(levelcomplete*bonus) ; 
			 System.out.println("Your final score is " + finalscore) ; 
		 }
		 
		
 	
	/* In JAVA, once a variable is created between "{" and "}", we can't use them outside the
 	 * brackets in java. The scope of the variable or the accessibility of the variable
 	 * is limited to the code blocks itself i.e it is limited to "{" and "}" . 
 	 * WE CAN CALL IT AS BLOCK SCOPE AS WELL. 
 	 * 
 	 *   We can also abbreviate " if (gameover==true)"  to  " if (gameover) "
 	 *   and it will mean the same thing. 
     */ 
		 
                                 // CHALLENGE
	
	//Print out a second score on the screen with the following 
		 // score set to 10,000
		 //levelCompleted set to 8
		 //bonus set to 200 
		 //But make sure the printout above still displays as well
		 
		 
		score=10_000 ; 
		levelcomplete=8;
		bonus=200;
		
		
		 int secondscore=score+(levelcomplete*bonus) ; 
		  System.out.println("Your second score is " + secondscore) ;
		
	
	
	
	
	
	
	
	
	
	}
	
	

}
