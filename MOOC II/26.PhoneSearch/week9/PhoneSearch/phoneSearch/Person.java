package week9.PhoneSearch.phoneSearch;

import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person> {

	private String fName;
	private Set<String> phoneNumbers;
	private Set<String> Addresses;

	public Person(String fName) {
		this.fName = fName;
		this.phoneNumbers = new HashSet<String>();
		this.Addresses = new HashSet<String>();
	}

	public String getfName() {
		return fName;
	}

	public Set<String> getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public Set<String> getAddresses() {
		return this.Addresses;
	}

	public void addPhoneNumber(String number) {
		this.phoneNumbers.add(number);
	}

	public void addAddress(String city, String street) {
		this.Addresses.add(city + " " + street);
	}

	public void printPhoneNumbers() {
		if (phoneNumbers.isEmpty() == true) {
			System.out.println("  phone number not found");
		}
		for (String n : phoneNumbers) {
			System.out.print("   " + n + "\n");
		}
	}

	public void printAddresses() {
		if (Addresses.isEmpty() == true) {
			System.out.println("  address unkown");
		} else {
			System.out.print("  address: ");
			for (String n : Addresses) {
				System.out.print(" " + n + "\n");
			}
		}
	}

	@Override
	public int compareTo(Person o) {
		return this.fName.compareTo(o.fName);
	}

}
