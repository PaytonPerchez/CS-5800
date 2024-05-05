package homework8;

public class KitKatDispenserHandler extends SnackDispenserHandler {

	public KitKatDispenserHandler(SnackDispenserHandler next) {
		super(next);
	}
	
	@Override
	public boolean handleRequest(Snack request) {
		
		if(request.getName().equals("KitKat")) {
			request.decrementQuantity();
			return true;
		} else {
			return super.handleRequest(request);
		}
	}
}
