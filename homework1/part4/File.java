package homework1.part4;

public class File {

	private String name;
	private String type;
	private int sizeInBytes;
	
	public File(String name, String type) {
		this(name, type, 0);
	}
	
	public File(String name, String type, int sizeInBytes) {
		this.name = name;
		this.type = type;
		this.sizeInBytes = sizeInBytes;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getSize() {
		return sizeInBytes;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setSize(int sizeInBytes) {
		this.sizeInBytes = sizeInBytes;
	}
	
	@Override
	public String toString() {
		return name + "." + type + " (" + sizeInBytes + " bytes)";
	}
}
