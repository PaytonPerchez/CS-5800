package homework8;

public class CheetosDispenserHandler extends SnackDispenserHandler {

	public CheetosDispenserHandler(SnackDispenserHandler next) {
		super(next);
	}
	
	@Override
	public boolean handleRequest(Snack request) {
		
		if(request.getName().equals("Cheetos")) {
			request.decrementQuantity();
			return true;
		} else {
			return super.handleRequest(request);
		}
	}
}
