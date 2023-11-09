package phones;

public class DeskPhone extends Phone {
	private Voltage voltage;
	private boolean connected;
	

public DeskPhone (String model, Dimension dimension, Voltage voltage) {
	super(model,dimension);
	this.voltage = voltage;
	connected = false; //  A new DeskPhone out of the box is never connected.
}

public void plugIn() {
	connected = true;
}

public void unplug() {
	connected = false;
}

public boolean isConneted() {
	return connected;
}

public String toString() {
	String connectionInfo = connected ? "connected" : "not connected";
	return super.toString() + " " + voltage + " " + connectionInfo;
}
}
