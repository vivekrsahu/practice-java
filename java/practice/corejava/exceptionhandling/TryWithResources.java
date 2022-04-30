package practice.corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * No need of finally block as try with resources takes care of closing the resources, 
 * provided the resources should be auto-closable i.e., should implement {@code java.lang.}{@link AutoCloseable} interface.
 * 
 *	@since JDK 1.7
 */
public class TryWithResources {
	public void someMethodWithOneResource() {
		try (BufferedReader reader = new BufferedReader(new FileReader("someFile.txt"))) {
			// code goes here
			// reader will be closed automatically once the control reaches end of try block either normally or abnormally.
		} catch (IOException ioException) {
			// exception handling goes here
		}
	}

	public void someMethodWithMultipleResources() {
		try (FileWriter fileWriter = new FileWriter("someFile.txt"); FileReader fileReader = new FileReader("someFile.txt")) {
			
		} catch (IOException ioException) {
			// exception handling goes here
		}
	}
}
