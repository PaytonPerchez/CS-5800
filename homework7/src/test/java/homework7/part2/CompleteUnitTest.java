package homework7.part2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({SongDatabaseTest.class, SongProxyTest.class, SongTest.class})
public class CompleteUnitTest {

}
