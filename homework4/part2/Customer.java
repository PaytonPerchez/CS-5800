package homework4.part2;

public class Customer {

	private String name;
	private DietPlan dietPlan;
	
	public Customer(String name) {
		this(name, DietPlan.None);
	}
	
	public Customer(String name, DietPlan dietPlan) {
		this.name = name;
		this.dietPlan = dietPlan;
	}
	
	public String getName() {
		return name;
	}
	
	public DietPlan getDietPlan() {
		return dietPlan;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setDietPlan(DietPlan newPlan) {
		dietPlan = newPlan;
	}
	
	@Override
	public String toString() {
		return name + " prefers meals that satisfy the following diet: " + dietPlan.name();
	}
}
