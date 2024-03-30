package s24.cs5800;

public class Burger implements FoodItem {

	private static final float BASE_COST = 4.99f;
	
	public float calculateCost() {
		return BASE_COST;
	}
}
