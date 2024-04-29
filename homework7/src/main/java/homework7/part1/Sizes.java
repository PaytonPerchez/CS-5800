package homework7.part1;

public enum Sizes {
	
	TWELVE(12),
	FOURTEEN(14),
	SIXTEEN(16);
	
	private int size;
	
	private Sizes(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}
