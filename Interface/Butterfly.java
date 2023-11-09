package Interface;

import java.util.ArrayList;
import java.util.List;

public class Butterfly extends Insect {
    private List<String> colors;

    public Butterfly(String species, List<String> colors) {
    	super(species);
        // Create a defensive copy of the colors list
        this.colors = new ArrayList<>(colors);
    }

    public Butterfly(Butterfly butterfly) {
        this(butterfly.getSpecies(), butterfly.getColors());
    }

	public List<String> getColors() {
        return new ArrayList<>(colors);
    }

    @Override
    public String toString() {
    	if (colors.isEmpty()) {
            return getSpecies() + " []";
        } else {
            StringBuilder sb = new StringBuilder(getSpecies() + " [");
            for (int i = 0; i < colors.size(); i++) {
                sb.append(colors.get(i));
                if (i < colors.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
}
    }
}