package practice.corejava.java8.lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import practice.corejava.java8.lambda.Person.Sex;

public final class LambdaAllInOne {
	/** Approach1:<br>
	 *  Similar to these two methods, we need to define multiple methods for each criteria.<br>
	 *  Here, filter method is an aggregate operation that operates on Stream not Collection
	 *  and hence the Collection is first converted into Stream.
	 */
//	private static Stream<Person> fetchPersonsWithGender(List<Person> persons, Sex gender) {
//		return persons.stream().filter(person -> person.getGender() == gender);
//	}
//	private static Stream<Person> fetchPersonsWithinAgeRange(List<Person> persons, int minAge, int maxAge) {
//		return persons.stream().filter(person -> (person.getAge() > minAge && person.getAge() < maxAge));
//	}
	/** Approach2:<br>
	 *  Instead of defining multiple methods for each criterion, here the eligibility 
	 *  criteria itself is passed, that contains all criteria required for the person's 
	 *  eligibility check. But an interface is created that adds to the additional cost.
	 */
//	private static Stream<Person> fetchSpecificPersons(List<Person> persons, PersonCriteria criteria) {
//		return persons.stream().filter(person -> criteria.test(person));
//	}
//	@FunctionalInterface // an interface with single abstract method is by default a functional interface, no need to define explicitly
//	interface PersonCriteria {
//		boolean test(Person person);
//	}
	/** Approach3:<br>
	 * 	Instead of creating an additional interface, re-use the existing functional interface
	 * 	provided by {@code java.util.function} package. But it is still not completely dynamic, 
	 * 	we can still break the tight coupling between the criteria & the action.
	 */
//	private static <T> Stream<T> fetchSpecificPersonsUsingPredicate(List<T> persons, Predicate<T> criteria) {
//		return persons.stream().filter(person -> criteria.test(person));
//	}
	/** Fully optimized & dynamic approach:<br>
	 * 	Instead of defining the operation inside the condition, here, criteria and action 
	 * 	are dynamically passed at runtime as two individual entities.
	 */
	private static<T> void fetchSpecificPersonsFullyOptimized(List<T> persons, Predicate<T> criteria, Consumer<T> action) {
		persons.stream().filter(person -> criteria.test(person)).forEach(action);
	}
	/** For applying some additional intermediate function:<br>
	 * 	If before printing the persons, some additional function is required to be done on them.
	 */
	private static<K, V> void performAndFetchSpecificPersons(List<K> persons, Predicate<K> criteria, Function<K, V> intermediateFn, Consumer<V> action) {
		persons.stream().filter(person -> criteria.test(person)).map(person -> intermediateFn.apply(person)).forEach(field -> action.accept(field));
	}
	public static void main(String[] args) {
		List<Person> personsList = preparePersonsList();
		// Approach1
//		System.out.println("List of Males:\n===============================================================");
//		fetchPersonsWithGender(personsList, Sex.MALE).forEach(System.out::println);
//		System.out.println("\nPersons whose age is between 25 and 55\n===============================================================");
//		fetchPersonsWithinAgeRange(personsList, 25, 55).forEach(System.out::println);
		// Approach2
//		System.out.println("List of Females between age 30 and 50:\n===============================================================");
//		fetchSpecificPersons(personsList, new PersonCriteria() {
//			@Override
//			public boolean test(Person person) {
//				return (person.getAge() > 30 && person.getAge() < 50 && person.getGender() == Sex.FEMALE);
//			}
//		}).forEach(System.out::println);
		// Approach3
//		System.out.println("List of Females between age 30 and 50:\n===============================================================");
//		fetchSpecificPersonsUsingPredicate(personsList, new Predicate<Person>() {
//			@Override
//			public boolean test(Person person) {
//				return (person.getAge() > 30 && person.getAge() < 50 && person.getGender() == Sex.FEMALE);
//			}
//		}).forEach(System.out::println);
		// Fully optimized & dynamic approach
		System.out.println("List of Females between age 30 and 50:\n===============================================================");
		fetchSpecificPersonsFullyOptimized(personsList, 
				(person -> person.getAge() > 30 // condition 1
				&& person.getAge() < 50 // condition 2
				&& person.getGender() == Sex.FEMALE), // condition 3
				System.out::println); // required action to be taken if the above conditions satisfy
		// with some more operations
		System.out.println("\nEmail Ids of Females between age 30 and 50:\n===============================================================");
		performAndFetchSpecificPersons(personsList, 
				(person -> person.getAge() > 30 // condition 1
				&& person.getAge() < 50 // condition 2
				&& person.getGender() == Sex.FEMALE), // condition 3
				person -> person.getEmailAddress(), // perform additional function
				System.out::println); // required action to be taken after perform the above operations
	}
	private static List<Person> preparePersonsList() {
		return Arrays.asList(
				new Person("JKS", LocalDate.of(1959, 5, 8), Sex.MALE, "jks@test.com"),
				new Person("GS", LocalDate.of(1964, 4, 10), Sex.FEMALE, "gs.test.com"),
				new Person("PAB", LocalDate.of(1983, 12, 4), Sex.FEMALE, "pab.test.com"),
				new Person("PAS", LocalDate.of(1984, 12, 24), Sex.FEMALE, "pas.test.com"),
				new Person("PMJ", LocalDate.of(1987, 6, 30), Sex.FEMALE, "pmj.test.com"),
				new Person("VRS", LocalDate.of(1993, 7, 29), Sex.MALE, "vrs.test.com")
				);
	}
}
