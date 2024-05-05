package homework8;

public abstract class SnackDispenserHandler {

	private SnackDispenserHandler next;
	
	public SnackDispenserHandler(SnackDispenserHandler next) {
		this.next = next;
	}
	
	public boolean handleRequest(Snack request) {
		if(next != null) {
			return next.handleRequest(request);
		} else {
			return false;
		}
	}
}
