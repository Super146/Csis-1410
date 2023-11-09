package phones;

public class PushButtomPhone extends DeskPhone  {
	
	public PushButtomPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
		
	}

	
	
	public String call(long number) {
		return "Pushing buttons to call " + number;
	}

}
