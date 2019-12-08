package sum3and5;

public class Sum3And5Challenge {
	public static void main (String[] args) {
		int p=0;
		int sum=0;
		for(int i=1; i<1000; i++)
		{
			if( (i%3==0) && (i%5==0) ) {
				p++; 
				sum=sum+i;
			System.out.println("number " + i + " is divisible by 3 as well as 5");	
			 }
			if(p==5) {
				System.out.println("Exiting for loop");
		        break;	
			}
			}
		System.out.println("Sum is " + sum);  		
	}
}
	


