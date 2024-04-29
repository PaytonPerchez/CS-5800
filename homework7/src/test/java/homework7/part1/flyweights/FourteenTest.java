package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Sizes;

public class FourteenTest {

	@Test
	public void testGetSize() {
		Fourteen fourteen = new Fourteen();
		Sizes expected = Sizes.FOURTEEN;
		
		Sizes actual = fourteen.getSize();
		
		assertEquals(expected, actual);
	}
}
