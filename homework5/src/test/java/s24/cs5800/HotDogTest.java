package s24.cs5800;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotDogTest {

	@Test
	public void testCalculateCost() {
		FoodItem hotdog = new HotDog();
		float expected = 3.99f;
		
		float actual = hotdog.calculateCost();
		
		assertEquals(expected, actual);
	}
}
