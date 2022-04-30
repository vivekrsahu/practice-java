package practice.corejava.java8.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Practice1Java8 {
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

		// Create a method that prints all persons whose last name begins with R
		System.out.println("\nPrinting persons with last name starting with R");
		printConditionally(personList, person -> person.getLastName().startsWith("R"));

		// Create a method that prints all persons whose first name begins with V
		System.out.println("\nPrinting persons with first name starting with V");
		printConditionally(personList, person -> person.getFirstName().startsWith("V"));
	}
	private static void printConditionally(List<PersonBean> personList, SpecificCondition specificCondition) {
		for (PersonBean person : personList) {
			if (specificCondition.applyCondition(person)) {
				System.out.println(person);
			}
		}
	}
//	private static void printConditionally(List<PersonBean> personList, Predicate<PersonBean> specificCondition) {
//        for (PersonBean person : personList) {
//            if (specificCondition.test(person)) {
//                System.out.println(person);
//            }
//        }
//    }

}
