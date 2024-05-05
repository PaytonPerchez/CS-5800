package homework8;

public class StateOfVendingMachine {

	private States currentState;
	private Snack currentTarget;
	private SnackDispenserHandler handler;
	
	public StateOfVendingMachine() {
		currentState = States.IDLE;
		currentTarget = new Snack("", -1, -1);
		handler = new CokeDispenserHandler(
						new PepsiDispenserHandler(
						new CheetosDispenserHandler(
						new DoritosDispenserHandler(
						new KitKatDispenserHandler(
						new SnickersDispenserHandler(null))))));
	}
	
	public States getState() {
		return currentState;
	}
	
	public void setTargetSnack(Snack target) {
		if(currentState == States.IDLE) {
			currentTarget = target;
			System.out.println("Selecting " + target.getName() + ", awaiting payment...");
			currentState = States.WAITING_FOR_MONEY;
		}
	}
	
	public float insertMoney(float money) {
		if(currentTarget.getQuantity() == 0) {
			currentState = States.IDLE;
			System.out.println("Returning $" + money + ", no " + currentTarget.getName() + " in stock\n");
			return money;
		}
		
		if((currentState == States.WAITING_FOR_MONEY) && (money >= currentTarget.getPrice())) {
			currentState = States.DISPENSING_SNACK;
			System.out.println("Accepting $" + currentTarget.getPrice() +
								", returning $" + (money - currentTarget.getPrice()));
			return money - currentTarget.getPrice();
		} else {
			currentState = States.IDLE;
			System.out.println("Returning $" + money + ", not enough money\n");
			return money;
		}
	}
	
	public Snack dispenseSnack() {
		if(currentState == States.DISPENSING_SNACK) {
			currentState = States.IDLE;
			
			if(handler.handleRequest(currentTarget)) {
				System.out.println("Dispensing " + currentTarget.getName() + "\n");
				return currentTarget;
			}
		}
		return null;
	}
}
