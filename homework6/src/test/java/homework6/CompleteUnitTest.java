package homework6;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ChatHistoryTest.class, ChatServerTest.class, MessageMementoTest.class,
				MessageTest.class, SearchMessagesByUserTest.class, UserTest.class})
public class CompleteUnitTest {

}
