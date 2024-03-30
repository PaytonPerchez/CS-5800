package s24.cs5800;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {

	@Test
	public void testCalculateCost() {
		FoodItem burger = new Burger();
		float expected = 4.99f;
		
		float actual = burger.calculateCost();
		
		assertEquals(expected, actual);
	}
}
