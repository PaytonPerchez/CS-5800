package homework1.part1;

public class BaseEmployee extends Employee {

	private float baseSalary;
	
	public BaseEmployee(String firstName, String lastName, int[] socialSecurityNumber, float baseSalary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSocialSecurityNumber(socialSecurityNumber);
		this.baseSalary = baseSalary;
	}
	
	public float getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
}
