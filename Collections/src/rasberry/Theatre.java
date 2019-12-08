package rasberry;
import java.util.*;
public class Theatre {

	private  String theatreNAME; 
// Here we are changing it to more generic. To be more generic, we can replace List with  
// Collection    
	private List<Seat> seats = new ArrayList<>();  // We are changing from linked list to 
	  // HashSet/LinkedHashSet just to explain and learn about sets
	
	
	public Theatre(String theatreName, int numRows, int seatPerRow) {
		if(theatreName!=null) {
			this.theatreNAME=theatreName; 
		}
		
		int lastRow= 'A'+(numRows-1); 
		for(char row='A';row<=lastRow; row++ ) {
			for(int seatNum=1; seatNum<=seatPerRow; seatNum++) {
				Seat seat = new Seat (row+String.format("%02d", seatNum)); 
				seats.add(seat); 
			}
		}
	}
	public String getTheatreName() {
		return theatreNAME ; 
	}
	
	public boolean reserveSeat(String seatNumber) {
		
		Seat requestedSeat=new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat); 
		
		if(foundSeat >=0) {
			System.out.print(".");
			return seats.get(foundSeat).reserve();
			 
		}
		else {
			System.out.println("There is no seat "+seatNumber);
			return false; 
		}
		
//		for(Seat seat:seats) {
//			System.out.print(".");
//			if(seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat=seat; 
//				break; 
//			}
//		}
//		if(requestedSeat==null) {
//			System.out.println("there is no seat " + seatNumber);
//		}
//		
//		return requestedSeat.reserve(); 
	}
	
	//for testing
	public void getSeats() {
		for(Seat seat: seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	
	
	public class Seat implements Comparable<Seat> {
		private  String seatNumber;
		private boolean reserved=false; 
		
		public Seat(String seatNumber) {
			if(seatNumber!=null) {
				this.seatNumber=seatNumber; 
			}
		}
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved=true; 
				System.out.println("Seat "+ seatNumber+ " reserverd");
				return true; 
			}else {
			return false; } 
		}
		public boolean cancel() {
			if(this.reserved) {
				this.reserved=false; 
				System.out.println("reservation of seat "+seatNumber+" is cancelled ");
				return true; 
			}
			else {
				return false; 
				}
			
		}
		public String getSeatNumber() {
			return this.seatNumber; 
		}
		@Override
		public int compareTo(Seat seat) {
		
			// TODO Auto-generated method stub
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
		
		
	}
}
	

