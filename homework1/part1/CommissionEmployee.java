package homework1.part1;

public class CommissionEmployee extends Employee {

	private float commissionRate;
	private float grossSalary;
	
	public CommissionEmployee(String firstName, String lastName, int[] socialSecurityNumber, float commissionRate, float grossSalary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSocialSecurityNumber(socialSecurityNumber);
		this.commissionRate = commissionRate;
		this.grossSalary = grossSalary;
	}
	
	public float getCommissionRate() {
		return commissionRate;
	}
	
	public float getGrossSalary() {
		return grossSalary;
	}
	
	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}
}
