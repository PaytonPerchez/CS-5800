package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Sizes;

public class SixteenTest {

	@Test
	public void testGetSize() {
		Sixteen sixteen = new Sixteen();
		Sizes expected = Sizes.SIXTEEN;
		
		Sizes actual = sixteen.getSize();
		
		assertEquals(expected, actual);
	}
}
