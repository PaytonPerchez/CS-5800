package homework1.part2;

public class ShipCreator {

	private static Ship[] ships = new Ship[3];
	
	public static void main(String[] args) {
		ships[0] = new Ship("USS Ship", "1990");
		ships[1] = new CruiseShip("St. Ship", "2000", 2000);
		ships[2] = new CargoShip("Shipper", "2010", 40000);
		
		for(Ship ship : ships)
		{
			ship.print();
		}
	}
}
