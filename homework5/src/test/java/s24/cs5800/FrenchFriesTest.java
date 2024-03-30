package s24.cs5800;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrenchFriesTest {

	@Test
	public void testCalculateCost() {
		FoodItem fries = new FrenchFries();
		float expected = 1.49f;
		
		float actual = fries.calculateCost();
		
		assertEquals(expected, actual);
	}
}
