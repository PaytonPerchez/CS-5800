package homework1.part2;

public class CruiseShip extends Ship {

	private int maxNumOfPassengers;
	
	public CruiseShip(String name, String yearBuilt, int maxNumOfPassengers) {
		super(name, yearBuilt);
		this.maxNumOfPassengers = maxNumOfPassengers;
	}
	
	public int getMaxNumOfPassengers() {
		return maxNumOfPassengers;
	}
	
	public void setMaxNumOfPassengers(int maxNumOfPassengers) {
		this.maxNumOfPassengers = maxNumOfPassengers;
	}
	
	@Override
	public void print() {
		System.out.println(getName() + ", capacity of " + maxNumOfPassengers + " people");
	}
}
