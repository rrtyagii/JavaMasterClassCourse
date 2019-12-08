package decimalComparator;

public class DecimalComparator {
   public static void main(String[] args) {
	   areEqualByThreeDecimalPlaces(3,3) ; 
}
	public static boolean areEqualByThreeDecimalPlaces(double numb1, double numb2) {
		boolean numberSame=false;
		int numb3;
		int numb4;
		//3.125 and 3.1254 :- this should return true.
		System.out.println("number 1 is " + numb1 + " and Number 2 is " + numb2);
		numb1=numb1*1000; 
		System.out.println("Number 1= "+ numb1);
	//	numb1=Math.round(numb1);
   //	System.out.println("after rounding up Number 1= "+ numb1);
		numb2=numb2*1000;
		System.out.println("Number 2= "+ numb2);
	//	numb2=Math.round(numb2); 
	//  System.out.println("after rounding up Number 2= " + numb2);
		
		numb3=(int)numb1; 
		numb4=(int)numb2; 
		
		if(numb3==numb4) {
			System.out.println("NUMBER ARE EQUAL UPTO THREE DECIMAL PLACES");
			numberSame=true; 
			System.out.println(numberSame);
		}
		else {
			System.out.println(numberSame);
		}
		
		return numberSame; 
	}

}
