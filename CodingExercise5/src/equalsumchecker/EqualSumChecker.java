package equalsumchecker;

public class EqualSumChecker {
   public static void main(String[] args) {
	   hasEqualSum(1, -1, 0) ; 
   }
   public static boolean hasEqualSum(int a, int b, int c) {
	   boolean sumChecker=false;
	   ; 
	   
	   if(c==(a+b) ) {
		   sumChecker=true; 
		   System.out.println(sumChecker);
	   }
	   else {
		   System.out.println(sumChecker);
	   }
	   
	   
	   return sumChecker; 
   }
}
