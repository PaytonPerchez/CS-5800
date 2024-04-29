package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Colors;

public class BlueTest {

	@Test
	public void testGetColor() {
		Blue blue = new Blue();
		Colors expected = Colors.BLUE;
		
		Colors actual = blue.getColor();
		
		assertEquals(expected, actual);
	}
}
