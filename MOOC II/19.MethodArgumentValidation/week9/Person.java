package week9;

public class Person {

	private String fName;
	private int age;

	public Person(String fName, int age) {
		if (fName.length() > 40 || fName == null || fName.isEmpty() == true || age < 0 || age > 120) {
			throw new IllegalArgumentException("illegal!");
		}
		this.age = age;
		this.fName = fName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name:" + this.fName + " Age:" + this.age;
	}

}
