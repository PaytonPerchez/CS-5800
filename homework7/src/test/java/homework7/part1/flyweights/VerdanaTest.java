package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.Fonts;

public class VerdanaTest {

	@Test
	public void testGetFont() {
		Verdana verdana = new Verdana();
		Fonts expected = Fonts.VERDANA;
		
		Fonts actual = verdana.getFont();
		
		assertEquals(expected, actual);
	}
}
