package homework7.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.flyweights.Red;

public class ColorFactoryTest {

	@Test
	public void testGetColor() {
		ColorFactory factory = new ColorFactory();
		boolean expected = true;
		
		boolean actual = factory.getColor(0) instanceof Red;
		
		assertEquals(expected, actual);
	}
}
