package s24.cs5800;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KetchupDecoratorTest {

	@Test
	public void testCalculateCost() {
		FoodItem burger = new Burger();
		float expected = 0.99f + burger.calculateCost();
		
		KetchupDecorator decorator = new KetchupDecorator(burger);
		float actual = decorator.calculateCost();
		
		assertEquals(expected, actual);
	}
}
