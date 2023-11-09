package phones;

import java.util.Random;

public class SmartPhone extends Phone{
	private int storage;
	private String model;
	private Dimension dimension;

public SmartPhone (String model, Dimension dimension, int storage) {
	super(model, dimension);
	if (storage <= 0) {
		throw new IllegalArgumentException ("Storage needs to be assigned a positive value.");
	}
	
	
	this.storage = storage;
	this.model = model;
	this.dimension = dimension;
}

public String call (long number) {
	// calling number by Selecting the number
	return "Calling " + number + " by selecting the number";
}

public String browse() {
	return "Browsing the web";
}

public String takePicture() {
	Random random = new Random();
boolean isHorizontal = random.nextBoolean();
if (isHorizontal) {
    return "Taking a horizontal picture";
} else {
    return "Taking a vertical picture";
}

}

public String toString() {
    return model + " " + dimension + " " + storage + "GB";
}

}
