package challenge;

public class Printer {

	private int numberOfPagesPrinted; 
	private int tonerLevel ;
    private String model; 
    private boolean duplexPrinter; 
    private int pagesInPrinter; 
    
    public Printer( int tonerLevel, String model, boolean duplexPrinter) {
		super();
       if(tonerLevel>=-1 && tonerLevel<=100) { 	
		this.tonerLevel = tonerLevel;
       }
       else {
    	   this.tonerLevel=-1; 
       }
		this.model = model;
		this.duplexPrinter = duplexPrinter;
	}
	public void fillTonerLevel(int tonerLevel) {
		  
		if(tonerLevel>0 && tonerLevel<=100) {
		   while(this.tonerLevel!=100) {
			  tonerLevel++;	   
		  }
		}
		
//		else if(this.tonerLevel==100) {
//			 this.tonerLevel=tonerLevel;
//			 System.out.println("toner is completely filled");
//			 
//		 }
		 else {
			 System.out.println("error");
		  }
		
   }
   public void printPage(int printedPages) {
	   printedPages++;
//	   int pagesPresent
	   if(printedPages>=0) {
		   this.numberOfPagesPrinted=printedPages; 
	   }
	   System.out.println("the number of printed page is "+this.numberOfPagesPrinted);
	   
   }
   public void pagesInPrinter(int pages) {
	   if(this.pagesInPrinter==0) {
		   pages++; 
	   }
	   System.out.println("pages in printer ready are "+pages);
   }
/**
 * @return the numberOfPagesPrinted
 */
public int getNumberOfPagesPrinted() {
	return numberOfPagesPrinted;
}
/**
 * @param numberOfPagesPrinted the numberOfPagesPrinted to set
 */
public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
	this.numberOfPagesPrinted = numberOfPagesPrinted;
}
/**
 * @return the tonerLevel
 */
public int getTonerLevel() {
	return tonerLevel;
}
/**
 * @param tonerLevel the tonerLevel to set
 */
public void setTonerLevel(int tonerLevel) {
	this.tonerLevel = tonerLevel;
}
/**
 * @return the model
 */
public String getModel() {
	return model;
}
/**
 * @param model the model to set
 */
public void setModel(String model) {
	this.model = model;
}
/**
 * @return the duplexPrinter
 */
public boolean isDuplexPrinter() {
	return duplexPrinter;
}
/**
 * @param duplexPrinter the duplexPrinter to set
 */
public void setDuplexPrinter(boolean duplexPrinter) {
	this.duplexPrinter = duplexPrinter;
}
   

}
	 
	 
	

