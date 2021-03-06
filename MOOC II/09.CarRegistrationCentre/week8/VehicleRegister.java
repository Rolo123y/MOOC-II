package week8;

import java.util.HashMap;

public class VehicleRegister {

	private HashMap<RegistrationPlate, String> Owners;

	public VehicleRegister() {
		this.Owners = new HashMap<RegistrationPlate, String>();
	}

	public boolean add(RegistrationPlate plate, String owner) {
		if (this.Owners.get(plate) != null) {
			return false;
		}
		this.Owners.put(plate, owner);
		return true;
	}

	public String get(RegistrationPlate plate) {
		if (this.Owners.containsKey(plate) != false && this.Owners.get(plate) != null) {
			return Owners.get(plate);
		}
		return null;
	}

	public boolean delete(RegistrationPlate plate) {
		if (get(plate) == null) {
			return false;
		}
		this.Owners.remove(plate);
		return true;
	}

	public void printRegistrationPlates() {
		for (RegistrationPlate p : Owners.keySet()) {
			System.out.print(p + "\n");
		}
	}

	public void printOwners() {
		String temp = "[";
		for (RegistrationPlate p : Owners.keySet()) {
			if (!temp.contains(Owners.get(p))) {
				temp += Owners.get(p) + ", ";
			}
		}
		System.out.print(temp.substring(0, temp.length() - 2) + "]");
	}

}
