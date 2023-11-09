package Interface;

public class Telemarketer extends Person implements Nuisance {

	public Telemarketer(String name, int age) {
		super(name, age);
		
	}
	public String giveSalesPitch() {
		return getName() + " pressures others to buy stuff";
	}
	
	@Override
    public String annoy() {
        return getName() + " annoys by giving a sales pitch";
    }
	
}
