package homework4.part2;

public class FactoryCreator {

	public static MacronutrientFactory createFactory(String type) {
		
		switch(type.toLowerCase()) {
		case "carb":
			return CarbFactory.getInstance();
		case "protein":
			return ProteinFactory.getInstance();
		case "fat":
			return FatFactory.getInstance();
		default:
			System.out.println("Please specify a valid type");
			return null;
		}
	}
}
