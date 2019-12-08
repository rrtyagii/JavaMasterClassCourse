//THE CORRECT ONE 
// IT IS THE CODE THAT WAS ACCEPTED BY THE CODING EXERCISE BOT!

package codingExercise2;

public class Barking {
	
	public static void main( String[] args)
	
	{
		bark(true, 22  );
		
	}
	
	public static boolean bark (boolean barking, int hourOfday) {
	boolean wakeUp=false;
	
	if(barking)
	{
		if((hourOfday>=0) && (hourOfday<=23))
		{System.out.println("Valid Range");
		if((hourOfday<8) || (hourOfday>22))
		{
			wakeUp = true;
			System.out.println(wakeUp);
		}
		else{
			wakeUp=false; 
			System.out.println(wakeUp); }
		}
		else
		{
			wakeUp = false;
			System.out.println("Not a Valid Range");
			System.out.println(wakeUp);
		}
		
		
			
	}
	
	else 	
	{
	
	System.out.println(wakeUp);}
	return wakeUp; 
	}
}
