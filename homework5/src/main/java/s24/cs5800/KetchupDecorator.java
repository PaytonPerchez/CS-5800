package s24.cs5800;

public class KetchupDecorator implements FoodItem {

	private static final float KETCHUP_COST = 0.99f;
	private FoodItem originalItem;
	
	public KetchupDecorator(FoodItem originalItem) {
		this.originalItem = originalItem;
	}
	
	public float calculateCost() {
		return originalItem.calculateCost() + KETCHUP_COST;
	}
}
