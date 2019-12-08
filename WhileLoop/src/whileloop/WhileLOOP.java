package whileloop;

public class WhileLOOP {
  public static void main(String[] args) {
	  int number=4;
	  int finishNumber=20;
	  int p=0;
	  while(number<=finishNumber) {
		  number++;
		  if(!isEvenNumber(number)) {
			  continue; 
		  }
		  p++ ;
		  
		  System.out.println("Even number is " + number);
		  if(p>=5) {
			  System.out.println("We have found "+
		             p+" even numbers. Time to leave");
			  break;
		  } 
		  
	  }
	  System.out.println("Besides we found "+p+" even numbers");
  }
	public static boolean isEvenNumber(int number) {
		return number%2==0?true:false;	
		/* while(number%2==0){
		 * System.out.println(
		 * 
		 */
	}
	
}
