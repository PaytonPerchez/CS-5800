package homework8;

public class Driver {

	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		
		machine.selectSnack("Snickers");
		machine.insertMoney(0.99f);
		
		machine.selectSnack("Snickers");
		machine.insertMoney(0.99f);
		
		machine.selectSnack("Snickers");
		machine.insertMoney(0.99f);
		
		machine.selectSnack("Snickers");
		machine.insertMoney(0.99f);
		
		machine.selectSnack("Coke");
		machine.insertMoney(0.99f);
		
		machine.selectSnack("Coke");
		machine.insertMoney(2.99f);
		
		machine.selectSnack("Doritos");
		machine.insertMoney(2.99f);
	}
}
