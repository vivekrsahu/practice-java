package practice.corejava.contract;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Contract:<br>
 * If {@code equals()} is overridden, then similar logic should be used to 
 * override the {@code hashCode()}. i.e., if two objects are equal then their 
 * hashCode should also be same. Reverse is not necessary but recommended so 
 * as to improve the implementer’s (e.g., HashMap) performance.
 * 
 * @author Vivek Ranjan Sahu
 */
public final class HashCodeEquals {

	public static void main(String[] args) {
		contractViolation();
		reverseContractViolation();
	}

	/**
	 * According to {@link Employee#equals equals} method, Gyan (JL5) and Gyan (JL6)
	 * are same. So, only one entry should be added to the {@code employeeSet} but
	 * because of hashcode's wrong implementation, they didn't fall under the same 
	 * bucket for the equality check and hence two duplicates got inserted into the 
	 * {@code employeeSet} which is against the nature of {@link Set}.
	 */
	private static void contractViolation() {
		Employee employee[] = new Employee[5];
		employee[0] = new Employee("Gyan", 6);
		employee[1] = new Employee("Gyan", 5);
		employee[2] = new Employee("Prabhakar", 6);
		employee[3] = new Employee("Rochit", 5);
		employee[4] = new Employee("Guru", 4);
	
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.addAll(Arrays.asList(employee));
		// set debugger to see the table structure
		System.out.println("Employee details: " + employeeSet.toString());
	}

	/**
	 * As the {@link EmployeeReverse#hashCode hashcodes} of Gyan and Prabhakar are
	 * same, they fall under same bucket, so we have to traverse through Gyan in
	 * order to fetch/modify Prabhakar which is a performance loss.<br>
	 * Therefore, the reverse of the contract is not necessary but recommended.
	 */
	private static void reverseContractViolation() {
		EmployeeReverse employeeReverse[] = new EmployeeReverse[4];
		employeeReverse[0] = new EmployeeReverse("Gyan", 6);
		employeeReverse[1] = new EmployeeReverse("Prabhakar", 6);
		employeeReverse[2] = new EmployeeReverse("Rochit", 5);
		employeeReverse[3] = new EmployeeReverse("Guru", 4);

		Set<EmployeeReverse> set = new HashSet<>();
		set.addAll(Arrays.asList(employeeReverse));
		// set debugger to see the table structure
		System.out.println("Employee details: " + set.toString());
	}

}
