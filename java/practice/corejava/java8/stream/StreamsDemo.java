package practice.corejava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import practice.corejava.java8.common.PersonBean;

/**
 * @see Stream
 */
public class StreamsDemo {

	public static void main(String[] args) {
		List<PersonBean> personList = Arrays.asList(
				new PersonBean("Vivek", "Ranjan", 23),
				new PersonBean("Rajiv", "Ranjan", 32),
				new PersonBean("Biku", "Kukur", 23),
				new PersonBean("ABC", "XYZ", 13),
				new PersonBean("Viras", "Sahu", 24)
			);
		personList.stream() // preparing a stream for the specific collection
		.filter(person -> person.getLastName().startsWith("R")) // filtering conditions
		.forEach(person -> System.out.println(person.getFirstName())); // iterating and operating // this is a terminal condition

		long count = personList.parallelStream() // for splitting the stream into parallel threads that possibly provide a faster experience
		.filter(person -> person.getFirstName().startsWith("V"))
		.count(); // terminal condition
		System.out.println(count);

		// stream can't be re-used
		Stream<?> stream = personList.stream();
		stream.forEach(System.out::println);
		stream.forEach(System.out::println); // IllegalStateException
	}

}
