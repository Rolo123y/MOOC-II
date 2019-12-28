package week9.PhoneSearch.phoneSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PhoneBook {

	private List<Person> ListOfContacts;
	// private Map<String, Person> ListOfContacts2;

	public PhoneBook() {
		this.ListOfContacts = new ArrayList<Person>();
	}

	// 1
	public void addPerson(String fName, String number) {
		boolean contactFound = false;
		for (Person n : ListOfContacts) {
			if (n.getfName().equals(fName)) {
				n.addPhoneNumber(number);
				contactFound = true;
			}
		}
		if (contactFound == false) {
			Person person = new Person(fName);
			person.addPhoneNumber(number);
			ListOfContacts.add(person);
		}
	}

	// 2
	public void searchForNumbers(String fName) {
		boolean contactFound = false;
		for (Person n : ListOfContacts) {
			if (n.getfName().equals(fName)) {
				n.printPhoneNumbers();
				contactFound = true;
			}
		}
		if (contactFound == false) {
			System.out.println("  not found");
		}
	}

	// 3
	public String searchByNumber(String number) {
		for (Person n : ListOfContacts) {
			for (String a : n.getPhoneNumbers()) {
				if (a.equals(number)) {
					return n.getfName();
				}
			}
		}
		return " not found";
	}

	// 4
	public void addAddress(String fName, String city, String street) {
		boolean contactFound = false;
		for (Person n : ListOfContacts) {
			if (n.getfName().equals(fName)) {
				n.addAddress(city, street);
				contactFound = true;
			}
		}
		if (contactFound == false) {
			Person person = new Person(fName);
			person.addAddress(city, street);
			ListOfContacts.add(person);
		}
	}

	// 5
	public void searchPersonalInformation(String fName) {
		boolean contactFound = false;
		for (Person n : ListOfContacts) {
			if (n.getfName().equals(fName)) {
				n.printAddresses();
				System.out.println("  phone numbers:");
				n.printPhoneNumbers();
				contactFound = true;
			}
		}
		if (contactFound == false) {
			System.out.println("  not found");
		}
	}

	// 6
	public void deletePersonalInformation(String fName) {
		Iterator<Person> itr = ListOfContacts.iterator();
		while (itr.hasNext()) {
			Person person = itr.next();
			if (person.getfName().equals(fName)) {
				person.getPhoneNumbers().clear();
				person.getAddresses().clear();
				itr.remove();
			}
		}
	}

	// 7
	public void filteredListing(String keyword) {
		ArrayList<Person> sorted = new ArrayList<Person>();
		if (keyword.isEmpty() == true) {
			for (Person n : ListOfContacts) {
				sorted.add(n);
			}
			sortAndPrint(sorted);
		} else {
			for (Person n : ListOfContacts) {
				if (n.getfName().contains(keyword)) {
					sorted.add(n);
				}
			}
			sortAndPrint(sorted);
		}
	}

	public void sortAndPrint(ArrayList<Person> list) {
		if (list.isEmpty() == true) {
			System.out.println(" keyword not found");
		} else {
			Collections.sort(list);
			for (Person n : list) {
				System.out.println("\n" + n.getfName());
				n.printAddresses();
				System.out.println("  phone numbers:");
				n.printPhoneNumbers();
				System.out.println();
			}
		}
	}

}
