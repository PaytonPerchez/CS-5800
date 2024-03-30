package s24.cs5800;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CustomerTest {

	@ParameterizedTest
	@EnumSource(Loyalties.class)
	public void testGetLoyalty(Loyalties status) {
		Customer customer = new Customer("Name", status);
		assertEquals(status, customer.getLoyalty());
	}
	
	@Test
	public void testGetOrder() {
		Customer customer = new Customer("Name");
		FoodItem burger = new Burger();
		FoodItem[] expected = new FoodItem[] {burger};
		
		customer.placeOrder(burger);
		FoodItem[] actual = customer.getOrder().getItems().toArray(new FoodItem[1]);
		
		assertArrayEquals(expected, actual);
	}
	
	@ParameterizedTest
	@EnumSource(Loyalties.class)
	public void testGetBill(Loyalties status) {
		Customer customer = new Customer("Name", status);
		float discount = 1;
		
		switch(status) {
		// LOYAL_PLUS = 20% off
		case LOYAL_PLUS:
			discount -= 0.1;
		// LOYAL = 10% off
		case LOYAL:
			discount -= 0.1;
		default:
		}
		float expected = discount * customer.getOrder().calculateTotalCost();
		
		float actual = customer.getBill();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPlaceOrder() {
		Customer customer = new Customer("Name");
		FoodItem burger = new Burger();
		FoodItem[] expected = new FoodItem[] {burger};
		
		customer.placeOrder(burger);
		FoodItem[] actual = customer.getOrder().getItems().toArray(new FoodItem[1]);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testToString() {
		String expected = "Jake";
		
		Customer customer = new Customer(expected);
		String actual = customer.toString();
		
		assertEquals(expected, actual);
	}
}
