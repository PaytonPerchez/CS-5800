package homework4.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CarbFactory extends MacronutrientFactory {

	private static CarbFactory instance = null;
	private final static String[] CARBS = new String[] {"Cheese", "Bread", "Lentils", "Pistachio"};
	
	private CarbFactory() {}
	
	public static CarbFactory getInstance() {
		if(instance == null) {
			instance = new CarbFactory();
		}
		return instance;
	}
	
	@Override
	public String getRandomNutrients(DietPlan dietPlan) {
		
		ArrayList<String> validNutrients = new ArrayList<>(Arrays.asList(CARBS));
		
		// Remove food options according to the specified diet
		switch(dietPlan) {
		case Paleo:
			validNutrients.clear();
			validNutrients.add("Pistachio");
			break;
		case Vegan:
			validNutrients.remove("Cheese");
			break;
		case Nut_Allergy:
			validNutrients.remove("Pistachio");
			break;
		default:
			break;
		}
		
		// Generate and return a random carb from available food options
		Random randomGenerator = new Random();
		int randomIndex = randomGenerator.nextInt(validNutrients.size());
		return validNutrients.get(randomIndex);
	}
}
