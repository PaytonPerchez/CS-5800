package homework7.part1;

import homework7.part1.flyweights.CharacterFlyweight;

import java.util.HashMap;

public class CharacterFactory {

	private HashMap<Character, CharacterFlyweight> characters;
	
	public CharacterFactory() {
		characters = new HashMap<Character, CharacterFlyweight>();
	}
	
	public CharacterFlyweight getCharacter(char character) {
		if(!characters.containsKey(character)) {
			characters.put(character, new CharacterFlyweight(character));
		}
		return characters.get(character);
	}
}
