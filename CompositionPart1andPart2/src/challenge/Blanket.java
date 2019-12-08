package challenge;

public class Blanket {
   private int width, height, depth; 
   private String size; 
   private String type;


public Blanket(int width, int height, int depth, String size, String type) {
	super();
	this.width = width;
	this.height = height;
	this.depth = depth;
	this.size = size;
	this.type = type;
}


public void foldBlanket() {
	System.out.println("the blanket is fold");
}


/**
 * @return the width
 */
public int getWidth() {
	return width;
}


/**
 * @return the height
 */
public int getHeight() {
	return height;
}


/**
 * @return the depth
 */
public int getDepth() {
	return depth;
}


/**
 * @return the size
 */
public String getSize() {
	return size;
}


/**
 * @return the type
 */
public String getType() {
	return type;
}


} 
