package homework8;

public class VendingMachine {

	private StateOfVendingMachine state;
	private Snack[] snacks;
	
	public VendingMachine() {
		state = new StateOfVendingMachine();
		snacks = new Snack[] {
			new Snack("Coke", 2.99f, 3),
			new Snack("Pepsi", 2.99f, 3),
			new Snack("Cheetos", 1.99f, 3),
			new Snack("Doritos", 1.99f, 3),
			new Snack("KitKat", 0.99f, 3),
			new Snack("Snickers", 0.99f, 3),
		};
	}
	
	public boolean selectSnack(String snackName) {
		for(Snack snack : snacks) {
			if(snack.getName().equals(snackName)) {
				state.setTargetSnack(snack);
				return true;
			}
		}
		return false;
	}
	
	public Snack insertMoney(Float money) {
		money = state.insertMoney(money);
		return state.dispenseSnack();
	}
}
