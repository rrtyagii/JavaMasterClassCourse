	package com.rishabhtyagi;
	
	public class Operators {
	
		public static void main (String[] args) {
			float result = 1+2; 
			System.out.println("1+2 = " + result);
			
			float previousresult = result; 
			
			result = result - 1 ; 
			System.out.println("3-1 = " + result);
			
			previousresult = result ;
			result = result*10 ; 
			System.out.println("2*10 = " + result);
			
			previousresult = result ;
			result = result/5 ; 
			System.out.println("20/5 = " + result);
			
			previousresult = result ; 
			result = result % 3; 
			System.out.println("4 % 3 = " + result);
			
			result++ ;  //++ is saying increment the count result by one.
			
			System.out.println("Result is now  " + result);
			
			result -- ; 
			System.out.println("Result is now  " + result);
			
			result+=2 ; 
			System.out.println("Result is now  " + result);
			
			result*=2; 
			System.out.println("Result is now  " + result);
			
			result-=2;
			System.out.println("Result is now  " + result);
			
			result/=10;
			System.out.println("Result is now  " + result);
			
			boolean isAlien= true;
			if ( isAlien == false) 
				System.out.println("THIS IS AN ALIEN! RUN FOR YOUR LIFE" );
			
			int highscore = 99;
			int secondhighscore = 80;
					
				if (highscore == 100)
					System.out.println("You got the highest score" );
				if ( (highscore>secondhighscore) && (highscore <= 100) )
					System.out.println("You got the second highest score" );
				if ( (highscore==100) || (highscore >=99) )
	                System.out.println("This is the highest score") ;
				
				int newvalue=50; 
				
				if (newvalue==50 )
					System.out.println("This is an error" );
				
				boolean iscar = false; 
				if(iscar==true)
					System.out.println("There is a car parked outside" );
				
				iscar=true; 
				boolean wascar=iscar?true:false; 
				if(wascar)
					System.out.println("Wascar is true"); 
					
				//CHALLENGES
				System.out.println("\n") ; 
				double var=20d; 
				double var2=80d;
				double answer = (var + var2)* 25;
				System.out.println(answer);
				
				double remainder=answer % 40;
				System.out.println(remainder);
				System.out.println("\n") ;
				
				if(remainder <=20)
					System.out.println("TOTAL WAS OVER THE LIMIT") ; 
					
				
			
			
			
		}
	}
