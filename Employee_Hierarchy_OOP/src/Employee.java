
public class Employee extends Person{
	
	private long employeeID;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, long employeeID) {
		super(firstName, lastName);
		this.employeeID = employeeID;
	}
	
	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	
}
