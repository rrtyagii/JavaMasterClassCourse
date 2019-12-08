package switchStatement;

public class Switch { 
	public static void main (String[] args) {
		char switchValue='H' ;
		
		   switch(switchValue) {
		      case 'A': case 'B':	case 'C':case 'D':case 'E' :
		    	  System.out.println(switchValue+" was found");
		    	  break;
		     default:
		    	 System.out.println("The value typed is neither A , B, C, D or E");
		    	 break;
		                      }
	String month="JANUARY" ;
	    switch(month.toLowerCase()) {       //we could use month.tolowercase() to 
	      case "january" : case "june": case "august": 
	    	  System.out.println(month + " was typed");
	    	  break;
	      default:
	    	  System.out.println("NOTHING SIMILAR WAS TYPED");
	}
	}

}
