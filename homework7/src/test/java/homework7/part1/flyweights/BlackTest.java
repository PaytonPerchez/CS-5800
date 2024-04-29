package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Colors;

public class BlackTest {

	@Test
	public void testGetColor() {
		Black black = new Black();
		Colors expected = Colors.BLACK;
		
		Colors actual = black.getColor();
		
		assertEquals(expected, actual);
	}
}
