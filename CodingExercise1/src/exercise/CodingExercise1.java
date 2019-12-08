package exercise;

public class CodingExercise1 {
	public static void main (String[] args) {
		
		
		printMegaBytesAndKiloBytes(1254) ;
		
	}
	
	public static void printMegaBytesAndKiloBytes( int kiloBytes) {
		int megaBytes;
		int kiloByte ; 
		//1MB=1024KB
		
		if (kiloBytes>0) {
			kiloByte= kiloBytes%1024 ; 
       megaBytes= kiloBytes/1024 ;
       
       System.out.println( kiloBytes +" KB " + " = " 
                       + megaBytes + " MB " + "and " + kiloByte+" KB " ) ; 
       
		}
		else if (kiloBytes<0)
		{
		System.out.println("Invalid Value") ; 
	}

}

}
