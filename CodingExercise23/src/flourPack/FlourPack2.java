package flourPack;

public class FlourPack2 {
	
	public static void main(String[] args) {
//		* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
//
//		* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//
//		* canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
//
//		* canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 
//
//		* canPack (-3, 2, 12); should return false since bigCount is negative.

		boolean result1=canPack (1, 0, 4);
		System.out.println(result1);
		boolean result=canPack (1, 0, 5);
		System.out.println(result);
		boolean result2=canPack (0, 5, 4);System.out.println(result2);
		boolean result3= canPack (2, 2, 11);System.out.println(result3);
		boolean result4=canPack (-3, 2, 12);System.out.println(result4);
			 		
		
	}
	public static boolean canPack(int bigPack, int smallPack, int goal) {
		
		
		int sum=0 ; 
		
		
		while (sum<=goal && bigPack>0) {
			sum+=5; 
			bigPack-- ;
			
			if(sum==goal) return true; 
		}
		while(sum<=goal && smallPack>0) {
			sum+=1; 
			smallPack--; 
			if(sum==goal) return true; 		
		}
		return false; 
	} 
}