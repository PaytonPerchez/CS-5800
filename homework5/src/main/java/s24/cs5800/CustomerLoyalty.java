package s24.cs5800;

public class CustomerLoyalty {

	private Loyalties status;
	
	public CustomerLoyalty(Loyalties status) {
		this.status = status;
	}
	
	public float applyDiscount(float originalPrice) {
		float discount = 1;
		
		switch(status) {
		// LOYAL_PLUS = 20% off
		case LOYAL_PLUS:
			discount -= 0.1;
		// LOYAL = 10% off
		case LOYAL:
			discount -= 0.1;
		default:
		}
		
		return discount * originalPrice;
	}
	
	public Loyalties getStatus() {
		return status;
	}
}
