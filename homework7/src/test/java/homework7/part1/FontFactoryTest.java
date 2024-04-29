package homework7.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.flyweights.Arial;

public class FontFactoryTest {

	@Test
	public void testGetFont() {
		FontFactory factory = new FontFactory();
		boolean expected = true;
		
		boolean actual = factory.getFont(0) instanceof Arial;
		
		assertEquals(expected, actual);
	}
}
