package homework8;

public class SnickersDispenserHandler extends SnackDispenserHandler {

	public SnickersDispenserHandler(SnackDispenserHandler next) {
		super(next);
	}
	
	@Override
	public boolean handleRequest(Snack request) {
		
		if(request.getName().equals("Snickers")) {
			request.decrementQuantity();
			return true;
		} else {
			return super.handleRequest(request);
		}
	}
}
