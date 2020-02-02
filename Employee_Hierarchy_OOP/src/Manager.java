
public class Manager extends Employee {
	
	private int numberOfEmployees;
	
	public Manager() {
		
	}
	
	public Manager(String firstName, String lastName, long employeeID, int numberOfEmployees) {
		super(firstName, lastName, employeeID);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	

}
