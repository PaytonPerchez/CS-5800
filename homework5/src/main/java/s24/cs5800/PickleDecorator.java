package s24.cs5800;

public class PickleDecorator implements FoodItem {

	private static final float PICKLE_COST = 0.99f;
	private FoodItem originalItem;
	
	public PickleDecorator(FoodItem originalItem) {
		this.originalItem = originalItem;
	}
	
	public float calculateCost() {
		return originalItem.calculateCost() + PICKLE_COST;
	}
}
