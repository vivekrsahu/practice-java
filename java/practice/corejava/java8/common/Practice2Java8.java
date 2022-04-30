package practice.corejava.java8.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class Practice2Java8 {
	public static void main(String[] args) {
		List<PersonBean> personList = Arrays.asList(
                new PersonBean("Vivek", "Ranjan", 25),
                new PersonBean("Vivu", "Rajan", 32),
                new PersonBean("Biku", "Babu", 25),
                new PersonBean("ABC", "XYZ", 13),
                new PersonBean("Viras", "Sahu", 25)
            );
		// Sort list by last name
		Collections.sort(personList, (person1 , person2) -> person1.getLastName().compareTo(person2.getLastName()));

		// Create a method that prints all persons in the list
		System.out.println("Printing all persons");
		printConditionally(personList, person -> true);
		System.out.println("\nPerforming action as per the condition of the lambda expression");
		performConditionally(personList, person -> true, person -> System.out.println(person));

		// Create a method that prints all persons whose last name begins with R
		System.out.println("\nPrinting persons with last name starting with R");
		printConditionally(personList, person -> person.getLastName().startsWith("R"));
		System.out.println("\nPerforming action as per the condition of the lambda expression");
		performConditionally(personList, person -> person.getLastName().startsWith("R"), person -> System.out.println(person.getFirstName()));

		// Create a method that prints all persons whose first name begins with V
		System.out.println("\nPrinting persons with first name starting with V");
		printConditionally(personList, person -> person.getFirstName().startsWith("V"));
		System.out.println("\nPerforming action as per the condition of the lambda expression");
		performConditionally(personList, person -> person.getFirstName().startsWith("V"), person -> System.out.println(person.getAge()));

		List<PersonBean> uniqueList = new ArrayList<>(personList);
		performConditionally(personList, person -> person.getFirstName().startsWith("V"), person -> uniqueList.remove(person));
		System.out.println(uniqueList);
	}
	// using ready-made functional interfaces having same purpose instead of creating a new interface
	private static void printConditionally(List<PersonBean> personList, Predicate<PersonBean> specificCondition) {
		for (PersonBean person : personList) {
			if (specificCondition.test(person)) {
				System.out.println(person);
			}
		}
	}
	// passing all relevant conditions to the method
	private static void performConditionally(List<PersonBean> personList, Predicate<PersonBean> specificCondition, Consumer<PersonBean> consumer) {
		for (PersonBean person : personList) {
			if (specificCondition.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
