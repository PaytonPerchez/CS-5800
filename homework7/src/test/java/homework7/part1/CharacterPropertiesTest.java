package homework7.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import homework7.part1.flyweights.Font;
import homework7.part1.flyweights.Color;
import homework7.part1.flyweights.Size;

public class CharacterPropertiesTest {

	@Test
	public void testGetFont() {
		FontFactory fontFactory = new FontFactory();
		ColorFactory colorFactory = new ColorFactory();
		SizeFactory sizeFactory = new SizeFactory();
		CharacterProperties properties = new CharacterProperties(
			fontFactory.getFont(0),
			colorFactory.getColor(0),
			sizeFactory.getSize(0)
		);
		Font expected = fontFactory.getFont(0);
		
		Font actual = properties.getFont();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetColor() {
		FontFactory fontFactory = new FontFactory();
		ColorFactory colorFactory = new ColorFactory();
		SizeFactory sizeFactory = new SizeFactory();
		CharacterProperties properties = new CharacterProperties(
			fontFactory.getFont(0),
			colorFactory.getColor(0),
			sizeFactory.getSize(0)
		);
		Color expected = colorFactory.getColor(0);
		
		Color actual = properties.getColor();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSize() {
		FontFactory fontFactory = new FontFactory();
		ColorFactory colorFactory = new ColorFactory();
		SizeFactory sizeFactory = new SizeFactory();
		CharacterProperties properties = new CharacterProperties(
			fontFactory.getFont(0),
			colorFactory.getColor(0),
			sizeFactory.getSize(0)
		);
		Size expected = sizeFactory.getSize(0);
		
		Size actual = properties.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getRunLength() {
		FontFactory fontFactory = new FontFactory();
		ColorFactory colorFactory = new ColorFactory();
		SizeFactory sizeFactory = new SizeFactory();
		CharacterProperties properties = new CharacterProperties(
			fontFactory.getFont(0),
			colorFactory.getColor(0),
			sizeFactory.getSize(0)
		);
		int expected = 0;
		
		int actual = properties.getRunLength();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void incrementRunLength() {
		FontFactory fontFactory = new FontFactory();
		ColorFactory colorFactory = new ColorFactory();
		SizeFactory sizeFactory = new SizeFactory();
		CharacterProperties properties = new CharacterProperties(
			fontFactory.getFont(0),
			colorFactory.getColor(0),
			sizeFactory.getSize(0)
		);
		int expected = 6;
		
		properties.incrementRunLength(6);
		int actual = properties.getRunLength();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void decrementRunLength() {
		FontFactory fontFactory = new FontFactory();
		ColorFactory colorFactory = new ColorFactory();
		SizeFactory sizeFactory = new SizeFactory();
		CharacterProperties properties = new CharacterProperties(
			fontFactory.getFont(0),
			colorFactory.getColor(0),
			sizeFactory.getSize(0),
			6
		);
		int expected = 2;
		
		properties.decrementRunLength(4);
		int actual = properties.getRunLength();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testToString() {
		FontFactory fontFactory = new FontFactory();
		ColorFactory colorFactory = new ColorFactory();
		SizeFactory sizeFactory = new SizeFactory();
		CharacterProperties properties = new CharacterProperties(
			fontFactory.getFont(0),
			colorFactory.getColor(0),
			sizeFactory.getSize(0),
			5
		);
		String expected = fontFactory.getFont(0).getFont().name() + ", " +
						colorFactory.getColor(0).getColor().name() + ", " +
						sizeFactory.getSize(0).getSize().name() + ", " + 
						"5 characters";
		
		String actual = properties.toString();
		
		assertEquals(expected, actual);
	}
}
