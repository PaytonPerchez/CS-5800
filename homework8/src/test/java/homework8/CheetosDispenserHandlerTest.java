package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheetosDispenserHandlerTest {

	@Test
	public void testHandleRequest() {
		SnackDispenserHandler cheetosHandler = new CheetosDispenserHandler(null);
		Snack cheetos = new Snack("Cheetos", 1.99f, 2);
		int expected = 1;
		
		cheetosHandler.handleRequest(cheetos);
		int actual = cheetos.getQuantity();
		
		assertEquals(expected, actual);
	}
}
