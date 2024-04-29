package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Fonts;

public class ArialTest {

	@Test
	public void testGetFont() {
		Arial arial = new Arial();
		Fonts expected = Fonts.ARIAL;
		
		Fonts actual = arial.getFont();
		
		assertEquals(expected, actual);
	}
}
