package homework1.part1;

import java.util.Arrays;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private int[] socialSecurityNumber;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int[] getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSocialSecurityNumber(int[] socialSecurityNumber) {
		// Overwrite sensitive information before changing reference
		if(this.socialSecurityNumber != null)
		{
			Arrays.fill(this.socialSecurityNumber, 0);
		}
		this.socialSecurityNumber = socialSecurityNumber;
	}
}
