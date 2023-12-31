package phones;

public class Dimension {
	private double height;
	private double width;
	private double depth;
	

public Dimension (double height, double width, double depth) {
	
	if (height <= 0 || width <= 0 || depth <= 0) {
	  throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
	}
	this.height = height;
	this.width = width;
	this.depth = depth;
}



/**
 * @return the height
 */
public double getHeight() {
	return height;
}


/**
 * @return the width
 */
public double getWidth() {
	return width;
}


/**
 * @return the depth
 */
public double getDepth() {
	return depth;
}


@Override
public String toString() {
	return String.format("(%.1f x %.1f x %.1f)", height,width,depth);
			
}





}
