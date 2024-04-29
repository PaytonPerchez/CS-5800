package homework7.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.flyweights.Twelve;

public class SizeFactoryTest {

	@Test
	public void testGetSize() {
		SizeFactory factory = new SizeFactory();
		boolean expected = true;
		
		boolean actual = factory.getSize(0) instanceof Twelve;
		
		assertEquals(expected, actual);
	}
}
