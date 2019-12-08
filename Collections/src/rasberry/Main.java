package rasberry;

	public class Main {
       public static void main(String[] args) {
		Theatre theatre = new Theatre("Wave NOIDA", 8, 12); 
	//	theatre.getSeats();
		if(theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Seat is already reserved");
		}
		System.out.println("__________________________");
		if(theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Seat is already reserved");
		}
    }
}
