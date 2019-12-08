package challenge;

public class Wall {
 
	private String direction;

	public Wall(String direction) {
		super();
		this.direction = direction;
	} 
	public void whichColour(String colour) {
		System.out.println("the colour on the wall of "+direction+" direction is "+colour);
	}
	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
}
