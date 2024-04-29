package homework7.part1;

import homework7.part1.flyweights.Color;
import homework7.part1.flyweights.Font;
import homework7.part1.flyweights.Size;

public class CharacterProperties {

	private Font font;
	private Color color;
	private Size size;
	private int runLength;
	
	public CharacterProperties(Font font, Color color, Size size) {
		this(font, color, size, 0);
	}
	
	public CharacterProperties(Font font, Color color, Size size, int runLength) {
		this.font = font;
		this.color = color;
		this.size = size;
		this.runLength = runLength;
	}
	
	public Font getFont() {
		return font;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Size getSize() {
		return size;
	}
	
	public int getRunLength() {
		return runLength;
	}
	
	public void incrementRunLength(int magnitude) {
		runLength += magnitude;
		
		// Avoid negative values from buffer overflow
		if(runLength < 0) {
			runLength = 0;
		}
	}
	
	public void incrementRunLength() {
		incrementRunLength(1);
	}
	
	public void decrementRunLength(int magnitude) {
		runLength -= magnitude;
		
		// Avoid negative run lengths
		if(runLength < 0) {
			runLength = 0;
		}
	}
	
	public void decrementRunLength() {
		decrementRunLength(1);
	}
	
	@Override
	public String toString() {
		return font.getFont().name() + ", " + color.getColor().name() + ", "
				+ size.getSize().name() + ", " + runLength + " characters";
	}
}
