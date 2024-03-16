package homework4.part1;

import java.util.ArrayList;

public abstract class BasicPizzaChain implements PizzaChain {

	private Size size;
	private ArrayList<String> toppings = new ArrayList<>();
	
	@Override
	public BasicPizzaChain setSmall() {
		size = Size.small;
		return this;
	}
	
	@Override
	public BasicPizzaChain setMedium() {
		size = Size.medium;
		return this;
	}
	
	@Override
	public BasicPizzaChain setLarge() {
		size = Size.large;
		return this;
	}
	
	@Override
	public BasicPizzaChain addPepperoni() {
		toppings.add("pepperoni");
		return this;
	}
	
	@Override
	public BasicPizzaChain addSausage() {
		toppings.add("sausage");
		return this;
	}
	
	@Override
	public BasicPizzaChain addMushrooms() {
		toppings.add("mushrooms");
		return this;
	}
	
	@Override
	public BasicPizzaChain addBacon() {
		toppings.add("bacon");
		return this;
	}
	
	@Override
	public BasicPizzaChain addOnions() {
		toppings.add("onions");
		return this;
	}
	
	@Override
	public BasicPizzaChain addExtraCheese() {
		toppings.add("extra cheese");
		return this;
	}
	
	@Override
	public BasicPizzaChain addPeppers() {
		toppings.add("peppers");
		return this;
	}
	
	@Override
	public BasicPizzaChain addChicken() {
		toppings.add("chicken");
		return this;
	}
	
	@Override
	public BasicPizzaChain addOlives() {
		toppings.add("olives");
		return this;
	}
	
	@Override
	public BasicPizzaChain addSpinach() {
		toppings.add("spinach");
		return this;
	}
	
	@Override
	public BasicPizzaChain addTomatoAndBasil() {
		toppings.add("tomato and basil");
		return this;
	}
	
	@Override
	public BasicPizzaChain addBeef() {
		toppings.add("beef");
		return this;
	}
	
	@Override
	public BasicPizzaChain addHam() {
		toppings.add("ham");
		return this;
	}
	
	@Override
	public BasicPizzaChain addPesto() {
		toppings.add("pesto");
		return this;
	}
	
	@Override
	public BasicPizzaChain addSpicyPork() {
		toppings.add("spicy pork");
		return this;
	}
	
	@Override
	public BasicPizzaChain addHamAndPineapple() {
		toppings.add("ham and pineapple");
		return this;
	}
	
	@Override
	public Pizza makePizza() {
		return new Pizza(this, size, toppings.toArray(new String[toppings.size()]));
	}
}
