package practice.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Person> persons = java.util.Arrays.asList(
                    new Person("Vivek", "Sahu", "26", "India"),
                    new Person("Viraj", "Sahu", "22", "USA"),
                    new Person("Viraj", "Sahu", "26", "India"),
                    new Person("Vivek", "Sahu", "26", "USA"),
                    new Person("Vijay", "Sahu", "26", "India")
                );
        Collections.sort(persons, (person1, person2) -> person1.getCountry().compareTo(person2.getCountry()));
        List<Person> output = new ArrayList<>(persons.size());
        String country = null;
        for (int i = 0; i < persons.size(); i++) {
            if (country == null) {
                country = persons.get(i).getCountry();
            } else if (country == persons.get(i).getCountry()) {
                continue;
            }
            country = persons.get(i).getCountry();
            List<Person> list = new ArrayList<>();
            list.add(persons.get(i));
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(j).getCountry().equals(country)) {
                    list.add(persons.get(j));
                }
            }
            list.sort((person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName()));
            output.addAll(list);
        }
        System.out.println(output);
    }
    
}

class Person {
    private String firstName;
    private String lastName;
    private String age;
    private String country;
    public Person(String firstName, String lastName, String age, String country) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return firstName + "|" + lastName + "|" + age + "|" + country;
    }
}