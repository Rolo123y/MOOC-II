package week10.PersonAndTheirHeirs.Run;

import java.util.ArrayList;
import java.util.List;

import week10.PersonAndTheirHeirs.People.*;

public class Run_ {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
		people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

		printDepartment(people);
	}

	public static void printDepartment(List<Person> people) {
		for (Person n : people) {
			System.out.println(n);
		}
	}

}
