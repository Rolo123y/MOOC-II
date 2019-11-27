package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main13 {

	public static void main(String[] args) {

		List<Person> salaries = new ArrayList<Person>();
		salaries.add(new Person("Matti", 150000));
		salaries.add(new Person("Pekka", 3000));
		salaries.add(new Person("Mikko", 300));
		salaries.add(new Person("Arto", 10));
		salaries.add(new Person("Merja", 500));
		salaries.add(new Person("Pertti", 80));

		System.out.println(salaries);

		Collections.sort(salaries);
		System.out.println(salaries);
	}

}
