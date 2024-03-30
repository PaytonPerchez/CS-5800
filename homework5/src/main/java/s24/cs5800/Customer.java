package s24.cs5800;

public class Customer {

	private String name;
	private CustomerLoyalty loyalty;
	private CustomerOrder order;
	
	public Customer(String name) {
		this(name, Loyalties.NONE);
	}
	
	public Customer(String name, Loyalties loyalty) {
		this.name = name;
		this.loyalty = new CustomerLoyalty(loyalty);
		order = new CustomerOrder();
	}
	
	public Loyalties getLoyalty() {
		return loyalty.getStatus();
	}
	
	public CustomerOrder getOrder() {
		return order;
	}
	
	public float getBill() {
		return loyalty.applyDiscount(order.calculateTotalCost());
	}
	
	public void placeOrder(FoodItem newItem) {
		order.addFoodItem(newItem);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
