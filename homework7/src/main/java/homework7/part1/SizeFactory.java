package homework7.part1;

import homework7.part1.flyweights.Size;
import homework7.part1.flyweights.Twelve;
import homework7.part1.flyweights.Fourteen;
import homework7.part1.flyweights.Sixteen;

import java.util.HashMap;

public class SizeFactory {

	private HashMap<Integer, Size> sizes;
	
	public SizeFactory() {
		sizes = new HashMap<Integer, Size>();
	}
	
	public Size getSize(int sizeIndex) {
		
		if(!sizes.containsKey(sizeIndex)) {
			
			switch(sizeIndex) {
			
			case 0:
				sizes.put(sizeIndex, new Twelve());
				break;
			case 1:
				sizes.put(sizeIndex, new Fourteen());
				break;
			case 2:
				sizes.put(sizeIndex, new Sixteen());
				break;
			default:
				return null;
			}
		}
		
		return sizes.get(sizeIndex);
	}
}
