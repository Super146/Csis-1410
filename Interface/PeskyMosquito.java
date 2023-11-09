package Interface;

public class PeskyMosquito extends Insect implements Nuisance {
    public PeskyMosquito(String species) {
        super(species);
    }

   
    public String bite() {
        return "sucking blood";
        
        
    }
    
    public String buzz() {
		return getSpecies() + " buzzing around";
	}
    @Override
    public String annoy() {
        return "buzz buzz buzz";
    }


	
}
