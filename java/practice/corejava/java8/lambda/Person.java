package practice.corejava.java8.lambda;

import java.time.LocalDate;

public final class Person {
	public enum Sex {
		MALE, FEMALE;
	}
	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String emailAddress;
	public Person(String name, LocalDate birthday, Sex gender, String emailId) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailId;
	}
	public int getAge() {
		return LocalDate.now().compareTo(this.birthday);
	}
	public Sex getGender() {
		return this.gender;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
	public String getPersonDetails() {
		return ("Person name: " + this.name 
					+ ", Sex: " + this.gender 
					+ ", Age: " + getAge()
					+ ", Email Address: " + this.emailAddress);
	}
	@Override
	public String toString() {
		return getPersonDetails();
	}
}
