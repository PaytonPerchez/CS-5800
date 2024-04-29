package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Sizes;

public class TwelveTest {

	@Test
	public void testGetSize() {
		Twelve twelve = new Twelve();
		Sizes expected = Sizes.TWELVE;
		
		Sizes actual = twelve.getSize();
		
		assertEquals(expected, actual);
	}
}
