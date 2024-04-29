package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Colors;

public class RedTest {

	@Test
	public void testGetColor() {
		Red red = new Red();
		Colors expected = Colors.RED;
		
		Colors actual = red.getColor();
		
		assertEquals(expected, actual);
	}
}
