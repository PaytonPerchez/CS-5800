package homework4.part1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {

	private Size size;
	private PizzaChain sourceChain;
	private ArrayList<String> toppings;
	
	public Pizza(PizzaChain sourceChain, Size size, String... toppings) {
		if (sourceChain == null) {
			throw new IllegalArgumentException("Pizza must come from a valid chain.");
		} else if (size == null) {
			throw new IllegalArgumentException("Pizza must have a valid size.");
		}
		this.sourceChain = sourceChain;
		this.size = size;
		this.toppings = new ArrayList<>();
		this.toppings.addAll(Arrays.asList(toppings));
	}
	
	public Pizza setSourceChain(PizzaChain newSource) {
		sourceChain = newSource;
		return this;
	}
	
	public void eat() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		String finalToppings;
		
		// Format topping list properly
		if(toppings.size() == 1) {
			finalToppings = toppings.get(0);
		} else {
			finalToppings = "";
			for(int i = 0; i < toppings.size(); i++) {
				if ((i + 1) == toppings.size()) {
					finalToppings +=  "and " + toppings.get(i);
				} else {
					finalToppings +=  toppings.get(i) + ", ";
				}
			}
		}
		
		return "A delicious " + size.name() + " pizza from " + sourceChain + " with " + finalToppings + "!";
	}
}
