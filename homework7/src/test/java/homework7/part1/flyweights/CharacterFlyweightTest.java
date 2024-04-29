package homework7.part1.flyweights;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterFlyweightTest {

	@Test
	public void testGetChar() {
		char expected = 'a';
		CharacterFlyweight character = new CharacterFlyweight(expected);
		
		char actual = character.getChar();
		
		assertEquals(expected, actual);
	}
}
