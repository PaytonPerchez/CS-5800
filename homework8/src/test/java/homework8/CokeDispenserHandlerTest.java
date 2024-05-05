package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CokeDispenserHandlerTest {

	@Test
	public void testHandleRequest() {
		SnackDispenserHandler cokeHandler = new CokeDispenserHandler(null);
		Snack coke = new Snack("Coke", 1.99f, 2);
		int expected = 1;
		
		cokeHandler.handleRequest(coke);
		int actual = coke.getQuantity();
		
		assertEquals(expected, actual);
	}
}
