package homework7.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.flyweights.CharacterFlyweight;

public class CharacterFactoryTest {

	@Test
	public void testGetCharacter() {
		CharacterFactory factory = new CharacterFactory();
		char character = 'a';
		
		CharacterFlyweight expected = factory.getCharacter(character);
		CharacterFlyweight actual = factory.getCharacter(character);
		
		assertEquals(expected, actual);
	}
}
