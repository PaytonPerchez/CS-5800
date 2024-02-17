package homework1.part1;

public class HourlyEmployee extends Employee {

	private float wage;
	private int hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, int[] socialSecurityNumber, float wage, int hoursWorked) {
		setFirstName(firstName);
		setLastName(lastName);
		setSocialSecurityNumber(socialSecurityNumber);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	
	public float getWage() {
		return wage;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setWage(float wage) {
		this.wage = wage;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
