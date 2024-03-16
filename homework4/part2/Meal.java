package homework4.part2;

public class Meal {

	private Customer customer;
	private String carb;
	private String protein;
	private String fat;
	
	public Meal(Customer customer) {
		setCustomer(customer);
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public String getCarb() {
		return carb;
	}
	
	public String getProtein() {
		return protein;
	}
	
	public String getFat() {
		return fat;
	}
	
	public void setCustomer(Customer newCustomer) {
		customer = newCustomer;
		makeMeal();
	}
	
	public void setCarb(String newCarb) {
		carb = newCarb;
	}
	
	public void setProtein(String newProtein) {
		protein = newProtein;
	}
	
	public void setFat(String newFat) {
		fat = newFat;
	}
	
	@Override
	public String toString() {
		return customer.getName() + "'s order of " + carb + ", " + protein + ", " + fat + ".";
	}
	
	private void makeMeal() {
		MacronutrientFactory factory = FactoryCreator.createFactory("carb");
		carb = factory.getRandomNutrients(customer.getDietPlan());
		factory = FactoryCreator.createFactory("protein");
		protein = factory.getRandomNutrients(customer.getDietPlan());
		factory = FactoryCreator.createFactory("fat");
		fat = factory.getRandomNutrients(customer.getDietPlan());
	}
}
