package practice.corejava.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import practice.corejava.java8.common.PersonBean;

public class MethodReferenceDemo2 {
	public static void main(String[] args) {
		List<PersonBean> personList = Arrays.asList(
				new PersonBean("Vivek", "Ranjan", 23),
				new PersonBean("Rajiv", "Ranjan", 32),
				new PersonBean("Biku", "Kukur", 23),
				new PersonBean("ABC", "XYZ", 13),
				new PersonBean("Viras", "Sahu", 24)
			);
		System.out.println("Performing action as per the condition of the lambda expression");
		performConditionally(personList, person -> person.getFirstName().startsWith("V"), System.out :: println); // similar to person -> System.out.println(person)
	}
	private static void performConditionally(List<PersonBean> personList, Predicate<PersonBean> specificCondition, Consumer<PersonBean> consumer) {
		for (PersonBean person : personList) {
			if (specificCondition.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
