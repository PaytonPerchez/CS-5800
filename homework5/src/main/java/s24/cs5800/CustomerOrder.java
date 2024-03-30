package s24.cs5800;

import java.util.ArrayList;

public class CustomerOrder {

	private ArrayList<FoodItem> foodItems;
	
	public CustomerOrder() {
		foodItems = new ArrayList<FoodItem>();
	}
	
	public ArrayList<FoodItem> getItems(){
		return foodItems;
	}
	
	public void addFoodItem(FoodItem newItem) {
		foodItems.add(newItem);
	}
	
	public void removeFoodItem(FoodItem removedItem) {
		foodItems.remove(removedItem);
	}
	
	public float calculateTotalCost() {
		float total = 0;
		for(FoodItem item : foodItems) {
			total += item.calculateCost();
		}
		return total;
	}
}
