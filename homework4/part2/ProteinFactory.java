package homework4.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ProteinFactory extends MacronutrientFactory {

	private static ProteinFactory instance = null;
	private final static String[] PROTEINS = new String[] {"Fish", "Chicken", "Beef", "Tofu"};
	
	private ProteinFactory() {}
	
	public static ProteinFactory getInstance() {
		if(instance == null) {
			instance = new ProteinFactory();
		}
		return instance;
	}
	
	@Override
	public String getRandomNutrients(DietPlan dietPlan) {
		
		ArrayList<String> validNutrients = new ArrayList<>(Arrays.asList(PROTEINS));
		
		// Remove food options according to the specified diet
		switch(dietPlan) {
		case Paleo:
			validNutrients.remove("Tofu");
			break;
		case Vegan:
			validNutrients.clear();
			validNutrients.add("Tofu");
			break;
		default:
			break;
		}
		
		// Generate and return a random protein from available food options
		Random randomGenerator = new Random();
		int randomIndex = randomGenerator.nextInt(validNutrients.size());
		return validNutrients.get(randomIndex);
	}
}
