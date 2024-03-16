package homework4.part2;

public class Driver {

	public static void main(String[] args) {
		
		Customer dan = new Customer("Dan", DietPlan.None);
		Customer erica = new Customer("Erica", DietPlan.Nut_Allergy);
		Customer joe = new Customer("Joe", DietPlan.Paleo);
		Customer nancy = new Customer("Nancy", DietPlan.Vegan);
		Customer ralph = new Customer("Ralph", DietPlan.Vegan);
		Customer beatrice = new Customer("Beatrice", DietPlan.None);
		
		Meal dansMeal = new Meal(dan);
		Meal ericasMeal = new Meal(erica);
		Meal joesMeal = new Meal(joe);
		Meal nancysMeal = new Meal(nancy);
		Meal ralphsMeal = new Meal(ralph);
		Meal beatricesMeal = new Meal(beatrice);
		
		System.out.println(dansMeal);
		System.out.println(ericasMeal);
		System.out.println(joesMeal);
		System.out.println(nancysMeal);
		System.out.println(ralphsMeal);
		System.out.println(beatricesMeal);
	}
}
