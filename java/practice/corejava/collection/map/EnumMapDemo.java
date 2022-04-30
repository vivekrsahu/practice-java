package practice.corejava.collection.map;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

enum Employee {
	GYAN("Gyan"), PRABHAKAR("Prabhakar"), ROCHIT("Rochit"), GURU("Guru"), VIVEK("Vivek");

	private String empName;

	public String getEmpName() {
		return empName;
	}

	Employee(String empName) {
		this.empName = empName;
	}
};

/**
 * {@link EnumMap}
 * 
 * @author Vivek Ranjan Sahu
 */
public class EnumMapDemo {
	public static void main(String[] args) {
		Map<Employee, String> map = new EnumMap<>(Employee.class);
		map.put(Employee.GYAN, "PM");
		map.put(Employee.PRABHAKAR,"PM");
		map.put(Employee.ROCHIT, "TL");
		map.put(Employee.GURU, "TA");
		map.put(Employee.VIVEK, "SE");
		Iterator<Employee> iterator = map.keySet().iterator();
		Employee key;
		String value;
		while (iterator.hasNext()) {
			key = iterator.next();
			value = map.get(key);
			System.out.println(key.getEmpName() + ": " + value);
		}
	}

}
