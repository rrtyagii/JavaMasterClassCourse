package codingexercise;

public class CodingExercise6 {
	public static void main(String[] args){
		hasTeen(23, 22, 34) ;
	}
	public static boolean hasTeen(int a, int b, int c) {
		boolean isTeen=false; 
		
		if( (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19) ) {
			System.out.println("The number is in range");
			isTeen=true; 
			System.out.println(isTeen);
			}
		
		else {
			System.out.println("No number is in range");
			System.out.println(isTeen);
		}
		
	    return isTeen; 
	}

}
