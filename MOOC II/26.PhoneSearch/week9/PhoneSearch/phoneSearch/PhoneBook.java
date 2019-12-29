package week9.PhoneSearch.phoneSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PhoneBook {

	private Map<String, Person> ListOfContacts2;

	public PhoneBook() {
		this.ListOfContacts2 = new HashMap<>();
	}

	// 1
	public void addPerson(String fName, String number) {
		if (ListOfContacts2.containsKey(fName)) {
			ListOfContacts2.get(fName).addPhoneNumber(number);
		} else {
			Person person = new Person(fName);
			person.addPhoneNumber(number);
			ListOfContacts2.put(person.getfName(), person);
		}
	}

	// 2
	public void searchForNumbers(String fName) {
		if (ListOfContacts2.containsKey(fName)) {
			for (Person n : ListOfContacts2.values()) {
				if (n.getfName().equals(fName)) {
					n.printPhoneNumbers();
				}
			}
		} else {
			System.out.println("  not found");
		}
	}

	// 3
	public String searchByNumber(String number) {
		for (Person n : ListOfContacts2.values()) {
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
		if (ListOfContacts2.containsKey(fName)) {
			for (String n : ListOfContacts2.keySet()) {
				if (n.equals(fName)) {
					ListOfContacts2.get(n).addAddress(city, street);
				}
			}
		} else {
			Person person = new Person(fName);
			person.addAddress(city, street);
			ListOfContacts2.put(person.getfName(), person);
		}
	}

	// 5
	public void searchPersonalInformation(String fName) {
		if (ListOfContacts2.containsKey(fName)) {
			for (String n : ListOfContacts2.keySet()) {
				if (n.equals(fName)) {
					ListOfContacts2.get(n).printAddresses();
					System.out.println("  phone numbers:");
					ListOfContacts2.get(n).printPhoneNumbers();
				}
			}
		} else {
			System.out.println("  not found");
		}
	}

	// 6
	public void deletePersonalInformation(String fName) {
		Iterator<Map.Entry<String, Person>> itr = ListOfContacts2.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Person> entry = itr.next();
			if (entry.getKey().equals(fName)) {
				itr.remove();
			}
		}
	}

	// 7
	public void filteredListing(String keyword) {
		ArrayList<Person> sorted = new ArrayList<Person>();
		if (keyword.isEmpty() == true) {
			for (Person n : ListOfContacts2.values()) {
				sorted.add(n);
			}
			sortAndPrint(sorted);
		} else {
			for (String n : ListOfContacts2.keySet()) {
				if (n.contains(keyword)) {
					sorted.add(ListOfContacts2.get(n));
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
