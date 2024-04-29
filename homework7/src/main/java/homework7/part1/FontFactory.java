package homework7.part1;

import homework7.part1.flyweights.Font;
import homework7.part1.flyweights.Arial;
import homework7.part1.flyweights.Calibri;
import homework7.part1.flyweights.Verdana;

import java.util.HashMap;

public class FontFactory {

	private HashMap<Integer, Font> fonts;
	
	public FontFactory() {
		fonts = new HashMap<Integer, Font>();
	}
	
	public Font getFont(int fontIndex) {
		
		if(!fonts.containsKey(fontIndex)) {
			
			switch(fontIndex) {
			
			case 0:
				fonts.put(fontIndex, new Arial());
				break;
			case 1:
				fonts.put(fontIndex, new Calibri());
				break;
			case 2:
				fonts.put(fontIndex, new Verdana());
				break;
			default:
				return null;
			}
		}
		
		return fonts.get(fontIndex);
	}
}
