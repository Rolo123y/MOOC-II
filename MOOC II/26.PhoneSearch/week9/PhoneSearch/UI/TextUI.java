package week9.PhoneSearch.UI;

import java.util.Scanner;

import week9.PhoneSearch.phoneSearch.Person;
import week9.PhoneSearch.phoneSearch.PhoneBook;

public class TextUI {

	private PhoneBook phoneBook;
	private Scanner reader;

	// private String testInput = "1\n" + "pekka\n" + "040-123456\n" + "2\n" +
	// "jukka\n" + "2\n" + "pekka\n" + "1\n"
	// + "pekka\n" + "09-222333\n" + "2\n" + "pekka\n" + "3\n" + "02-444123\n" +
	// "3\n" + "09-222333\n" + "5\n"
	// + "pekka\n" + "4\n" + "pekka\n" + "ida ekmanintie\n" + "helsinki\n" + "5\n" +
	// "pekka\n" + "4\n" + "jukka\n"
	// + "korsontie\n" + "vantaa\n" + "5\n" + "jukka\n" + "7\n" + "kk\n" + "7\n" +
	// "vantaa\n" + "7\n" + "seppo\n"
	// + "6\n" + "jukka\n" + "5\n" + "jukka\n" + "x\n";

	public TextUI() {
		this.phoneBook = new PhoneBook();
		this.reader = new Scanner(System.in);
	}

	public void run() {

		printCommands();

		while (true) {
			System.out.print("\ncommand: ");
			String num = reader.next();
			if (num.equals("x")) {
				System.exit(0);
			}
			commanHandler(num);
		}
	}

	private void printCommands() {
		System.out.println("phone search\r\n" + "available operations:\r\n" + " 1 add a number\r\n"
				+ " 2 search for a number\r\n" + " 3 search for a person by phone number\r\n" + " 4 add an address\r\n"
				+ " 5 search for personal information\r\n" + " 6 delete personal information\r\n"
				+ " 7 filtered listing\r\n" + " x quit");
	}

	private void commanHandler(String num) {
		if (num.equals("1")) {
			addNumber();
		} else if (num.equals("2")) {
			searchForANumber();
		} else if (num.equals("3")) {
			searchByPhoneNumber();
		} else if (num.equals("4")) {
			addAddress();
		} else if (num.equals("5")) {
			searchForPersonalInformation();
		} else if (num.equals("6")) {
			deletePersonalInformation();
		} else if (num.equals("7")) {
			filteredListing();
		} else {
			System.out.println("Command Not Found, Try Again!");
		}
	}

	// 1
	private void addNumber() {
		System.out.print("whose number: ");
		String fName = reader.next();
		System.out.print("number: ");
		String number = reader.next();
		phoneBook.addPerson(fName, number);
	}

	// 2
	private void searchForANumber() {
		System.out.print("whose number: ");
		String fName = reader.next();
		phoneBook.searchForNumbers(fName);
	}

	// 3
	private void searchByPhoneNumber() {
		System.out.print("number: ");
		String number = reader.next();
		System.out.println(" " + phoneBook.searchByNumber(number));
	}

	// 4
	private void addAddress() {
		System.out.print("whose address: ");
		String fName = reader.next();
		System.out.print("street: ");
		String street = reader.next();
		if (reader.hasNext()) {
			street += reader.next();
		}
		System.out.print("city: ");
		String city = reader.next();
		phoneBook.addAddress(fName, city, street);
	}

	// 5
	private void searchForPersonalInformation() {
		System.out.print("whose information: ");
		String fName = reader.next();
		phoneBook.searchPersonalInformation(fName);
	}

	// 6
	private void deletePersonalInformation() {
		System.out.print("whose information: ");
		String fName = reader.next();
		phoneBook.deletePersonalInformation(fName);
	}

	// 7
	private void filteredListing() {
		System.out.print("keyword (if empty, all listed): ");
		reader.nextLine();
		String keyword = reader.nextLine();
		phoneBook.filteredListing(keyword);
	}

}
