package Interface;

public class Insect {
	private String species;


	public Insect(String species) {
		// TODO Auto-generated constructor stub
		this.species = species;
	}



	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}
	
	public String toString() {
		return "Insect: " + species;
	}
	
	
}
