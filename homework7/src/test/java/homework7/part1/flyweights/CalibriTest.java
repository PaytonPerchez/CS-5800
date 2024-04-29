package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Fonts;

public class CalibriTest {

	@Test
	public void testGetFont() {
		Calibri calibri = new Calibri();
		Fonts expected = Fonts.CALIBRI;
		
		Fonts actual = calibri.getFont();
		
		assertEquals(expected, actual);
	}
}
