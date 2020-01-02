package week10.PersonAndTheirHeirs.People;

public class Student extends Person {

	private int Credits;

	public Student(String Name, String Address) {
		super(Name, Address);
		this.Credits = 0;
	}

	public int credits() {
		return this.Credits;
	}

	public void study() {
		this.Credits++;
	}

	@Override
	public String toString() {
		return super.toString() + "\n  credits " + this.Credits;
	}
}
