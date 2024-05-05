package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnackTest {

	@Test
	public void testGetName() {
		String expected = "Doritos";
		Snack doritos = new Snack(expected, 1.99f, 2);
		
		String actual = doritos.getName();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetPrice() {
		float expected = 1.99f;
		Snack doritos = new Snack("Doritos", expected, 2);
		
		float actual = doritos.getPrice();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetQuantity() {
		int expected = 2;
		Snack doritos = new Snack("Doritos", 1.99f, expected);
		
		int actual = doritos.getQuantity();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDecrementQuantity() {
		Snack doritos = new Snack("Doritos", 1.99f, 2);
		int expected = 1;
		
		doritos.decrementQuantity();
		int actual = doritos.getQuantity();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIncreaseQuantity() {
		Snack doritos = new Snack("Doritos", 1.99f, 2);
		int expected = 4;
		
		doritos.increaseQuantity(2);
		int actual = doritos.getQuantity();
		
		assertEquals(expected, actual);
	}
}
