package homework4.part1;

public class Dominos extends BasicPizzaChain {

	@Override
	public Pizza makePizza() {
		return super.makePizza().setSourceChain(this);
	}
	
	@Override
	public String toString() {
		return "Dominos";
	}
}
