package week10.FarmSimulator.Farm;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {
	private String OwnerName;
	private Barn barn;
	private Collection<Cow> animals;

	public Farm(String OwnerName, Barn barn) {
		this.OwnerName = OwnerName;
		this.barn = barn;
		this.animals = new ArrayList<Cow>();
	}

	public String getOwner() {
		return this.OwnerName;
	}

	public void addCow(Cow cow) {
		this.animals.add(cow);
	}

	public String FarmStatus() {
		String animalStatus = "";
		if (this.animals.isEmpty() || this.animals == null) {
			animalStatus += "\nNo cows.";
			return animalStatus;
		} else {
			animalStatus += "\nAnimals:\n";
			for (Milkable n : this.animals) {
				animalStatus += "\t" + n + "\n";
			}
			return animalStatus;
		}
	}

	@Override
	public void liveHour() {
		for (Cow n : this.animals) {
			n.liveHour();
		}
	}

	public void installMilkingRobot(MilkingRobot robot) {
		this.barn.installMilkingRobot(robot);
	}

	public void manageCows() {
		this.barn.takeCareOf(this.animals);
	}

	@Override
	public String toString() {
		return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn.toString() + FarmStatus();
	}

}
