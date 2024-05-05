package homework8;

public class PepsiDispenserHandler extends SnackDispenserHandler {

	public PepsiDispenserHandler(SnackDispenserHandler next) {
		super(next);
	}
	
	@Override
	public boolean handleRequest(Snack request) {
		
		if(request.getName().equals("Pepsi")) {
			request.decrementQuantity();
			return true;
		} else {
			return super.handleRequest(request);
		}
	}
}
