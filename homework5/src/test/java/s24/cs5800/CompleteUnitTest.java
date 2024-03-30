package s24.cs5800;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CustomerTest.class, CustomerOrderTest.class, CustomerLoyaltyTest.class, BurgerTest.class,
				FrenchFriesTest.class, HotDogTest.class, KetchupDecoratorTest.class, MustardDecoratorTest.class,
				PickleDecoratorTest.class, OnionDecoratorTest.class})
public class CompleteUnitTest {

}
