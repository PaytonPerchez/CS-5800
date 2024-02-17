package homework1.part1;

public class SalariedEmployee extends Employee {

	private float weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, int[] socialSecurityNumber, float weeklySalary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSocialSecurityNumber(socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	public float getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(float weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}
}
