package Interface;

public class Mosquito  extends Insect implements Nuisance{
	
	public Mosquito(String species) {
        super(species);
    }
	public String buzz() {
		return getSpecies() + " buzzing around";
	}
	
	@Override 
	
	public String annoy() {
		return "buzz buzz buzz";
	}
}
