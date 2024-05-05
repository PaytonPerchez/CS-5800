package homework8;

public class DoritosDispenserHandler extends SnackDispenserHandler {

	public DoritosDispenserHandler(SnackDispenserHandler next) {
		super(next);
	}
	
	@Override
	public boolean handleRequest(Snack request) {
		
		if(request.getName().equals("Doritos")) {
			request.decrementQuantity();
			return true;
		} else {
			return super.handleRequest(request);
		}
	}
}
