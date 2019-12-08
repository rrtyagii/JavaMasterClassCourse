package cognitive;

public class Main {
    
	 public static void main(String[] args) {
		ApunKiApniLinkedLIst list=new ApunKiApniLinkedLIst(null); 
		list.transverse(list.getRoot());
		 
		String stringData="5 7 3 9 8 2 1 0 4 6 ";  
		//error1:  Duplicates are adding, check the code, when I did the citites name.
		//error2:  Data isn't sorted to lowest to highest , when I put in the numbers.  
		String[] data = stringData.split(" "); 
		for(String s:data ) {
	//	 create a new item with value set to the string s; 
			list.addItem(new Concrete(s)); 
		
		}
		
		list.transverse(list.getRoot());	
	}
}
