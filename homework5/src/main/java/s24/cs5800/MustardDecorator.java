package s24.cs5800;

public class MustardDecorator implements FoodItem {

	private static final float MUSTARD_COST = 0.99f;
	private FoodItem originalItem;
	
	public MustardDecorator(FoodItem originalItem) {
		this.originalItem = originalItem;
	}
	
	public float calculateCost() {
		return originalItem.calculateCost() + MUSTARD_COST;
	}
}
