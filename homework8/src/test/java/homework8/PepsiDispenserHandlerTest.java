package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PepsiDispenserHandlerTest {

	@Test
	public void testHandleRequest() {
		SnackDispenserHandler pepsiHandler = new PepsiDispenserHandler(null);
		Snack pepsi = new Snack("Pepsi", 1.99f, 2);
		int expected = 1;
		
		pepsiHandler.handleRequest(pepsi);
		int actual = pepsi.getQuantity();
		
		assertEquals(expected, actual);
	}
}
