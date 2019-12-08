package codingExercise2;

public class CodingExercise2 {

	public static void main (String[] args) {

		bark(true, 6) ; 
	}

	public static boolean bark(boolean barking, int hourOfday) {
		boolean wakeUp=true;

		if(hourOfday>=0 && hourOfday<=23 )

{		     if (barking) 
        {
				if(hourOfday>8 && hourOfday<22)
				{
					System.out.println("false");
					wakeUp = false; 
					System.out.println(" Dog is barking but time is not in range");
				}
		} 

		     else if (!barking) 
		{ 
			wakeUp=false; 	
			System.out.println("Dog is not barking");
		}

		      else 
	 	{ 
			wakeUp = true ; 
			System.out.println(" wake up quickly --- correct time "); 
		}
}	

		else

{           wakeUp = false ;
			System.out.println(" Not in range "); 
}
		
		
		
		 System.out.println("me aa gya");
		
		return wakeUp;
	
	}

}
