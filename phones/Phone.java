package phones;


public class Phone {
	private Dimension dimension;
	private String model;

 Phone (String model, Dimension dimension) {
	this.model = model;
	this.dimension = dimension;
	
}


/**
 * @return the dimension
 */
public Dimension getDimension() {
	return dimension;
}


/**
 * @return the model
 */
public String getModel() {
	return model;
}


public String call(long number) {
	// Convert the long number to a String
    String numberAsString = Long.toString(number);

    // Return the resulting String
    return numberAsString;
}

@Override
public String toString() {
	return String.format("%s (%.1f x %.1f x %.1f)", model, dimension.getHeight(), dimension.getWidth(), dimension.getDepth());
}


}
