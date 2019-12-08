package challenge;

public class Bed {
	private String bedSize; 
	private Mattress mattress; 
	private Blanket blanket;
	public Bed(String bedSize, Mattress mattress, Blanket blanket) {
		super();
		this.bedSize = bedSize;
		this.mattress = mattress;
		this.blanket = blanket;
	}
	private void makeBed() {
		System.out.println("the bed is made");
	}
	/**
	 * @return the bedSize
	 */
	public String getBedSize() {
		return bedSize;
	}
	/**
	 * @return the mattress
	 */
	public Mattress getMattress() {
		return mattress;
	}
	/**
	 * @return the blanket
	 */
	public Blanket getBlanket() {
		return blanket;
	} 
	
	

}
