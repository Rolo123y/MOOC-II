package week10.PersonAndTheirHeirs.People;

public class Person {

	private String Name;
	private String Address;

	public Person(String Name, String Address) {
		this.Name = Name;
		this.Address = Address;
	}

	@Override
	public String toString() {
		return this.Name + "\n  " + this.Address;
	}

}
