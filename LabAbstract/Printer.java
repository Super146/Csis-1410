package LabAbstract;

public abstract class Printer {
	private String model;
	private static int count;
	private int serialNumber;
	
public Printer(String model) {
	count++;
	this.model = model;
	serialNumber = 12345 + count;
}

public String getModel() {
	return model;
}

public int getSerialNumber() {
	return serialNumber;
}

public abstract void print();

@Override
public String toString() {
    return this.getClass().getSimpleName() + ": " + getModel() + " #" + getSerialNumber();
}

}
