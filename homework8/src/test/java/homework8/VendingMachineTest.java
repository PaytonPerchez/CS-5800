package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

	@Test
	public void testSelectSnack() {
		VendingMachine machine = new VendingMachine();
		boolean expected = true;
		
		boolean actual = machine.selectSnack("Doritos");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInsertMoney() {
		VendingMachine machine = new VendingMachine();
		machine.selectSnack("Doritos");
		boolean expected = true;
		
		Snack result = machine.insertMoney(1.99f);
		boolean actual = result instanceof Snack;
		
		assertEquals(expected, actual);
	}
}
