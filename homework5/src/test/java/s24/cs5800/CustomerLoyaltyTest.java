package s24.cs5800;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerLoyaltyTest {

	@ParameterizedTest
	@EnumSource(Loyalties.class)
	public void applyDiscount(Loyalties status) {
		CustomerLoyalty loyalty = new CustomerLoyalty(status);
		float originalPrice = 5.99f;
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
		float expected = discount * originalPrice;
		
		float actual = loyalty.applyDiscount(originalPrice);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@EnumSource(Loyalties.class)
	public void getStatus(Loyalties status) {
		CustomerLoyalty loyalty = new CustomerLoyalty(status);
		
		assertEquals(status, loyalty.getStatus());
	}
}
