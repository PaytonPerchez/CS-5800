package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoritosDispenserHandlerTest {

	@Test
	public void testHandleRequest() {
		SnackDispenserHandler doritosHandler = new DoritosDispenserHandler(null);
		Snack doritos = new Snack("Doritos", 1.99f, 2);
		int expected = 1;
		
		doritosHandler.handleRequest(doritos);
		int actual = doritos.getQuantity();
		
		assertEquals(expected, actual);
	}
}
