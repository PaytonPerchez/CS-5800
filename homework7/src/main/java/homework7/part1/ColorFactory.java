package homework7.part1;

import homework7.part1.flyweights.Color;
import homework7.part1.flyweights.Red;
import homework7.part1.flyweights.Blue;
import homework7.part1.flyweights.Black;

import java.util.HashMap;

public class ColorFactory {

	private HashMap<Integer, Color> colors;
	
	public ColorFactory() {
		colors = new HashMap<Integer, Color>();
	}
	
	public Color getColor(int colorIndex) {
		
		if(!colors.containsKey(colorIndex)) {
			
			switch(colorIndex) {
			
			case 0:
				colors.put(colorIndex, new Red());
				break;
			case 1:
				colors.put(colorIndex, new Blue());
				break;
			case 2:
				colors.put(colorIndex, new Black());
				break;
			default:
				return null;
			}
		}
		
		return colors.get(colorIndex);
	}
}
