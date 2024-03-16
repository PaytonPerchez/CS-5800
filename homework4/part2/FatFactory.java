package homework4.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FatFactory extends MacronutrientFactory {

	private static FatFactory instance = null;
	private final static String[] FATS = new String[] {"Avocado", "Sour cream", "Tuna", "Peanuts"};
	
	private FatFactory() {}
	
	public static FatFactory getInstance() {
		if(instance == null) {
			instance = new FatFactory();
		}
		return instance;
	}
	
	@Override
	public String getRandomNutrients(DietPlan dietPlan) {
		
		ArrayList<String> validNutrients = new ArrayList<>(Arrays.asList(FATS));
		
		// Remove food options according to the specified diet
		switch(dietPlan) {
		case Vegan:
			validNutrients.remove("Tuna");
		case Paleo:
			validNutrients.remove("Sour cream");
			break;
		case Nut_Allergy:
			validNutrients.remove("Peanuts");
			break;
		default:
			break;
		}
		
		// Generate and return a random fat from available food options
		Random randomGenerator = new Random();
		int randomIndex = randomGenerator.nextInt(validNutrients.size());
		return validNutrients.get(randomIndex);
	}
}
