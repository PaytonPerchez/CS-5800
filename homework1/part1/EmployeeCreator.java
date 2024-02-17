package homework1.part1;

public class EmployeeCreator {

	public static void main(String[] args) {
		Employee joe = new SalariedEmployee("Joe", "Jones", new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, 2500);
		Employee stephanie = new HourlyEmployee("Stephanie", "Smith", new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2}, 25, 32);
		Employee mary = new HourlyEmployee("Mary", "Quinn", new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3}, 19, 47);
		Employee nicole = new CommissionEmployee("Nicole", "Dior", new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4}, 15, 50000);
		Employee renwa = new SalariedEmployee("Renwa", "Chanel", new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5}, 1700);
		Employee mike = new BaseEmployee("Mike", "Davenport", new int[] {6, 6, 6, 6, 6, 6, 6, 6, 6}, 95000);
		Employee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", new int[] {7, 7, 7, 7, 7, 7, 7, 7, 7}, 22, 40000);
	}
}
