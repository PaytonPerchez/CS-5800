package s24.cs5800;

public class Driver 
{
	public static void main( String[] args )
	{
    	Customer alice = new Customer("Alice");
    	Customer bob = new Customer("Bob", Loyalties.LOYAL);
    	Customer charlie = new Customer("Charlie", Loyalties.LOYAL_PLUS);
    	
    	FoodItem aliceBurger = new PickleDecorator(new OnionDecorator(new Burger()));
    	alice.placeOrder(aliceBurger);
    	System.out.println("Alice will pay $" + String.format("%.2f", alice.getBill()));
    	
    	FoodItem bobHotDog = new MustardDecorator(new HotDog());
    	bob.placeOrder(bobHotDog);
    	System.out.println("Bob will pay $" + String.format("%.2f", bob.getBill()));
    	
    	FoodItem charlieFries = new KetchupDecorator(new FrenchFries());
    	charlie.placeOrder(charlieFries);
    	System.out.println("Charlie will pay $" + String.format("%.2f", charlie.getBill()));
	}
}
