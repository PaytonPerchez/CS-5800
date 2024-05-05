package homework8;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CheetosDispenserHandlerTest.class, CokeDispenserHandlerTest.class,
				DoritosDispenserHandlerTest.class, KitKatDispenserHandlerTest.class,
				PepsiDispenserHandlerTest.class, SnickersDispenserHandlerTest.class,
				SnackTest.class, StateOfVendingMachineTest.class,
				VendingMachineTest.class})
public class CompleteUnitTest {

}
