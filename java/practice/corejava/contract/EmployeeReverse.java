package practice.corejava.contract;

/**
 * This class shows what happens if the reverse of the contracts are violated.
 * @author Vivek Ranjan Sahu
 */
public final class EmployeeReverse {
	private final String empName;
	private final int jobLevel;

	public EmployeeReverse(String empName, int jobLevel) {
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
	 * This API compares the job level and name of another employee to 
	 * that of the current employee.<br>i.e., it considers the other 
	 * employee as equal if it has same job level and same name.
	 */
	@Override
	public boolean equals(Object obj) {
		EmployeeReverse other = (EmployeeReverse) obj;
        return jobLevel == other.jobLevel && empName.equals(other.empName);
	}

	@Override
	public String toString() {
		return "[" + empName + ", " + jobLevel + "]";
	}

}