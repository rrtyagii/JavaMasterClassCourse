package javaRishabh;

public class Methods {
	public static void main (String [] args )
	{
		 
 // we could also assign the value returned to the method to another variable
		 
    int highscore=calculatescore(true, 800,5,100) ; 
	 System.out.println("Your final score is " + highscore) ; 
	              
	      highscore=	calculatescore(true, 10000 , 8, 200) ;
	 System.out.println("Your final score is " + highscore) ;	 
	
	  
		System.out.println("\n") ;
		System.out.println("CHALLENGE") ; 
		
		int highscoreposition = calculatehighscoreposition(1500) ;
		 displayhighscoreposition("Rishabh", highscoreposition) ;
		 
		 highscoreposition = calculatehighscoreposition(1000) ;
		 displayhighscoreposition("RANDOM", highscoreposition) ;
		
		 highscoreposition = calculatehighscoreposition(500) ;
		 displayhighscoreposition("RANDOM2", highscoreposition) ;
		
		 highscoreposition = calculatehighscoreposition(400) ;
		 displayhighscoreposition("RANDOM3", highscoreposition) ;
		
		 highscoreposition = calculatehighscoreposition(100) ;
		 displayhighscoreposition("RANDOM4", highscoreposition) ;
		 
		 highscoreposition = calculatehighscoreposition(50) ;
		 displayhighscoreposition("RANDOM5", highscoreposition) ;
		 
		
	
	
	
	
	}
	
	
     //Public static void is a method which has a name main. To create  
	//another method we have to go out of the previous method we were workingin
	// WE CAN'T CREATE A METHOD INSIDE A METHOD. ALSO WE DON'T WANT IT TO PUT OUTSIDE 
	//THE PUBLIC CLASS
	
	public static int calculatescore(boolean gameover, int score, int levelcomplete, int bonus )
	{
	// we need to use "public static" all in lower case to make a new method/function
		
		
		 if (gameover)  
			 
		 {
			 int finalscore=score+(levelcomplete*bonus) ; 
			 finalscore+=1000;
			 return finalscore; 
		 }
		
		return(-1) ; 
		
		
		
	}
	//challenge wale function
	public static int calculatehighscoreposition(int score) {
			
		if (score>=1000)
			{ return(1) ; }
		else if (score>=500 && score<1000) {
			return(2) ;  //HERE WE CAN REMOVE "score<1000" BECAUSE WHEN THE FIRST STATEMENT I.E "if (score>=1000)" 
		}       // IS FALSE WE WILL MOVE TO THE SECOND LINE WHICH MEANS THAT THE SCORE IS LESS THAN 1000. THAT IS WHY 
		       // WE MOVED TO SECOND LINE OF THE IF-ELSE STATEMENTS. SO WE CAN REMOVE THE "score<1000"
		       // AND THE CODE WILL BEHAVE THE SAME WAY.
		else if (score >=100 && score<500) {
			return(3) ;
		}
		else  {
			return(4) ; 
		}
/* TO GET RID OF THE SO MANY RETURN STATEMENTS WE COULD ALSO DO SOMETHING LIKE:-
 *    int position= 4 ; //assuming position 4 will returned
 *     if(score>=1000){
 *     position=1; }
 *     else if (score>=500) {
 *     position=2; }
 *    else if (score>=100) {
 *     position=3;
 *    } 
		
		return position; 
		
		
		
		
		
	
*/	       	
	}
	
	public static void displayhighscoreposition(String name, int position){
		
    System.out.println( name +" managed to get the positon of " 
                             + position + " on the high score table") ; 
      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

