package homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateOfVendingMachineTest {

	@Test
	public void testGetState() {
		StateOfVendingMachine state = new StateOfVendingMachine();
		States expected = States.IDLE;
		
		States actual = state.getState();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetTargetSnack() {
		StateOfVendingMachine state = new StateOfVendingMachine();
		States expected = States.WAITING_FOR_MONEY;
		
		state.setTargetSnack(new Snack("Doritos", 1.99f, 2));
		States actual = state.getState();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInsertMoney() {
		StateOfVendingMachine state = new StateOfVendingMachine();
		float expected = 0;
		
		state.setTargetSnack(new Snack("Doritos", 1.99f, 2));
		float actual = state.insertMoney(1.99f);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDispenseSnack() {
		StateOfVendingMachine state = new StateOfVendingMachine();
		States expected = States.IDLE;
		
		state.setTargetSnack(new Snack("Doritos", 1.99f, 2));
		state.insertMoney(1.99f);
		state.dispenseSnack();
		States actual = state.getState();
		
		assertEquals(expected, actual);
	}
}
