package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnickersDispenserHandlerTest {

	@Test
	public void testHandleRequest() {
		SnackDispenserHandler snickersHandler = new SnickersDispenserHandler(null);
		Snack snickers = new Snack("Snickers", 1.99f, 2);
		int expected = 1;
		
		snickersHandler.handleRequest(snickers);
		int actual = snickers.getQuantity();
		
		assertEquals(expected, actual);
	}
}
