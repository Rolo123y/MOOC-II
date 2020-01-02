package week10.PersonAndTheirHeirs.People;

public class Teacher extends Person {

	private int Salary;

	public Teacher(String Name, String Address, int Salary) {
		super(Name, Address);
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return super.toString() + "\n  salary " + this.Salary + " euros/month";
	}
}
