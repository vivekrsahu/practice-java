package practice.corejava.contract;

/**
 * This class shows what happens if the contract is violated.
 * @author Vivek Ranjan Sahu
 */
public final class Employee {
	private String empName;
	private int jobLevel;

	public Employee(String empName, int jobLevel) {
		this.empName = empName;
		this.jobLevel = jobLevel;
	}

	/**
	 * This API returns job level as the hashcode.
	 */
	@Override
	public int hashCode() {
		return jobLevel;
	}

	/**
	 * This API compares the name of another employee to that of 
	 * the current employee.<br>i.e., it considers the other 
	 * employee as equal if it has same name.
	 */
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if (empName.equals(other.empName)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "[" + empName + ", " + jobLevel + "]";
	}

}