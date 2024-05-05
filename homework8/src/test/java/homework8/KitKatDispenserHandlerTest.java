package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KitKatDispenserHandlerTest {

	@Test
	public void testHandleRequest() {
		SnackDispenserHandler kitKatHandler = new KitKatDispenserHandler(null);
		Snack kitKat = new Snack("KitKat", 1.99f, 2);
		int expected = 1;
		
		kitKatHandler.handleRequest(kitKat);
		int actual = kitKat.getQuantity();
		
		assertEquals(expected, actual);
	}
}
