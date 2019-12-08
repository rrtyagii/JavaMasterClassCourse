package challenge;

public class Mattress {
	
	private int numberofMattress;
	private int height; 
    private int width; 
    private int depth; 
    
    private String brand;

	public Mattress(int numberofMattress, int height, int width, int depth, String brand) {
		super();
		this.numberofMattress = numberofMattress;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.brand = brand;
	}

	/**
	 * @return the numberofMattress
	 */
	public int getNumberofMattress() {
		return numberofMattress;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	} 
    
    
}
