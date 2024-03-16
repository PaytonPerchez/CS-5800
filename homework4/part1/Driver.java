package homework4.part1;

public class Driver {

	public static void main(String[] args) {
		
		Pizza smallPizza = new PizzaHut().setSmall().addPepperoni().addOnions().addSpicyPork().makePizza();
		Pizza mediumPizza = new PizzaHut().setMedium().addPepperoni().addSausage().addPeppers().addTomatoAndBasil().addHam().addPesto().makePizza();
		Pizza largePizza = new PizzaHut().setLarge().addPepperoni().addSausage().addMushrooms().addExtraCheese().addPeppers().addOlives().addTomatoAndBasil().addSpicyPork().addHamAndPineapple().makePizza();
		
		smallPizza.eat();
		mediumPizza.eat();
		largePizza.eat();
		System.out.println();
		
		Pizza pizzaHutLarge = new PizzaHut().setLarge().addOnions().addExtraCheese().addOlives().makePizza();
		Pizza pizzaHutSmall = new PizzaHut().setSmall().addOnions().addHam().makePizza();
		
		Pizza littleCaesarsMedium = new LittleCaesars().setMedium().addMushrooms().addOnions().addPeppers().addOlives().addTomatoAndBasil().addBeef().addSpicyPork().addHamAndPineapple().makePizza();
		Pizza littleCaesarsSmall = new LittleCaesars().setSmall().addPepperoni().addMushrooms().addBacon().addOnions().addOlives().addBeef().makePizza();
		
		Pizza dominosSmall = new Dominos().setSmall().addHam().makePizza();
		Pizza dominosLarge = new Dominos().setLarge().addSausage().addSpinach().addBeef().makePizza();
		
		pizzaHutLarge.eat();
		pizzaHutSmall.eat();
		littleCaesarsMedium.eat();
		littleCaesarsSmall.eat();
		dominosSmall.eat();
		dominosLarge.eat();
	}
}
