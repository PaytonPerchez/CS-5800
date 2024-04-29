package homework7.part1;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import homework7.part1.flyweights.*;

@Suite
@SelectClasses({CharacterFactoryTest.class, CharacterPropertiesTest.class,
				ColorFactoryTest.class, FontFactoryTest.class, SizeFactoryTest.class,
				ArialTest.class, BlackTest.class, BlueTest.class, CalibriTest.class,
				CharacterFlyweightTest.class, FourteenTest.class, RedTest.class,
				SixteenTest.class, TwelveTest.class, VerdanaTest.class})
public class CompleteUnitTest {

}
