package s24.cs5800;

public class OnionDecorator implements FoodItem {

	private static final float ONION_COST = 0.99f;
	private FoodItem originalItem;
	
	public OnionDecorator(FoodItem originalItem) {
		this.originalItem = originalItem;
	}
	
	public float calculateCost() {
		return originalItem.calculateCost() + ONION_COST;
	}
}
