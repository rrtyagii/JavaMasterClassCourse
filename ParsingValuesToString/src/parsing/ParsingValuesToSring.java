package parsing;

public class ParsingValuesToSring {
 public static void main(String[] args) {
	 
	 String numberAsString="2018" ; 
	 int number=Integer.parseInt(numberAsString) ; 

       System.out.println(numberAsString);
       System.out.println(number);
       
       numberAsString+=1; 
       number+=1 ; 
       
       System.out.println(numberAsString);
       System.out.println(number);
 }
 
}
