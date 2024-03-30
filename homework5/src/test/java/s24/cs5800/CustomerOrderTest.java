package s24.cs5800;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CustomerOrderTest {
	
	@Test
	public void testGetItems() {
		CustomerOrder order = new CustomerOrder();
		FoodItem burger = new Burger();
		FoodItem[] expected = new FoodItem[] {burger};
		
		order.addFoodItem(burger);
		FoodItem[] actual = order.getItems().toArray(new FoodItem[1]);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testAddFoodItem() {
		CustomerOrder order = new CustomerOrder();
		FoodItem burger = new Burger();
		FoodItem[] expected = new FoodItem[] {burger};
		
		order.addFoodItem(burger);
		FoodItem[] actual = order.getItems().toArray(new FoodItem[1]);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testRemoveFoodItem() {
		CustomerOrder order = new CustomerOrder();
		FoodItem burger = new Burger();
		FoodItem[] expected = new FoodItem[] {};
		
		order.addFoodItem(burger);
		order.removeFoodItem(burger);
		FoodItem[] actual = order.getItems().toArray(new FoodItem[0]);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testCalculateTotalCost() {
		CustomerOrder order = new CustomerOrder();
		FoodItem burger = new Burger();
		FoodItem hotDog = new KetchupDecorator(new HotDog());
		float expected = burger.calculateCost() + hotDog.calculateCost();
		
		order.addFoodItem(burger);
		order.addFoodItem(hotDog);
		float actual = order.calculateTotalCost();
		
		assertEquals(expected, actual);
	}
}
