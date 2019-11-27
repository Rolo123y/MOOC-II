package week8;

public class Student implements Comparable<Student> {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareToIgnoreCase(o.name);
		// return o.name.compareToIgnoreCase(this.name);
	}

}
