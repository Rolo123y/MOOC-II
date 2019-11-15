package week8;

public class RegistrationPlate {

	private final String regCode;
	private final String country;

	public RegistrationPlate(String regCode, String country) {
		this.regCode = regCode;
		this.country = country;
	}

	public String toString() {
		return country + " " + regCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RegistrationPlate) || obj == null) {
			return false;
		}
		RegistrationPlate plate = (RegistrationPlate) obj;

		return true;
	}

	@Override
	public int hashCode() {
		if (this.regCode == null || this.country == null) {
			return -1;
		}
		return this.regCode.hashCode() + this.country.hashCode();
	}

}
