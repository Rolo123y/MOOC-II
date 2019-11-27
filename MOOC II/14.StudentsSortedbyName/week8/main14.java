package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main14 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Matti"));
		students.add(new Student("Pekka"));
		students.add(new Student("Arto"));
		students.add(new Student("Pertti"));

		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
	}

}
