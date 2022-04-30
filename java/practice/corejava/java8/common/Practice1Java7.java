package practice.corejava.java8.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Practice1Java7 {
	public static void main(String[] args) {
		List<PersonBean> personList = Arrays.asList(
				new PersonBean("Vivek", "Ranjan", 25),
				new PersonBean("Vivu", "Rajan", 32),
				new PersonBean("Biku", "Baba", 25),
				new PersonBean("ABC", "XYZ", 13),
				new PersonBean("Viras", "Sahu", 25)
			);
		// Sort list by last name
		Collections.sort(personList, new Comparator<PersonBean>() {
			@Override
			public int compare(PersonBean person1, PersonBean person2) {
				return person1.getLastName().compareTo(person2.getLastName());
			}
		});
		// Create a method that prints all persons in the list
		System.out.println("Printing all persons");
		printAllPersons(personList);
		// Create a method that prints all persons whose last name begins with R
		System.out.println("\nPrinting persons with last name starting with R");
		printConditionally(personList, new SpecificCondition() {
			@Override
			public boolean applyCondition(PersonBean person) {
				return person.getLastName().startsWith("R");
			}
		});
		// Create a method that prints all persons whose first name begins with V
		System.out.println("\nPrinting persons with first name starting with V");
		printConditionally(personList, new SpecificCondition() {
			@Override
			public boolean applyCondition(PersonBean person) {
				return person.getFirstName().startsWith("V");
			}
		});
	}
	private static void printAllPersons(List<PersonBean> personList) {
		for (PersonBean person : personList) {
			System.out.println(person);
		}
	}
	private static void printConditionally(List<PersonBean> personList, SpecificCondition specificCondition) {
		for (PersonBean person : personList) {
			if (specificCondition.applyCondition(person)) {
				System.out.println(person);
			}
		}
	}

}

interface SpecificCondition {
	boolean applyCondition(PersonBean person);
}

class UnnecessaryClass {
    // here the methods are tightly coupled with the logic
    void unnecessaryMethod1(List<PersonBean> personList) {
        for (PersonBean person : personList) {
            if (person.getLastName().startsWith("R")) {
                System.out.println(person);
            }
        }
    }
    void unnecessaryMethod2(List<PersonBean> personList) {
        for (PersonBean person : personList) {
            if (person.getFirstName().startsWith("V")) {
                System.out.println(person);
            }
        }
    }
}
