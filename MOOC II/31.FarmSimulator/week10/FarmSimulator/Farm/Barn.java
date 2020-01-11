package week10.FarmSimulator.Farm;

import java.util.Collection;

public class Barn {

	private BulkTank tank;
	private MilkingRobot robot;

	public Barn(BulkTank tank) {
		this.tank = new BulkTank();
		this.robot = null;
	}

	public BulkTank getBulkTank() {
		return this.tank;
	}

	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.robot = milkingRobot;
		this.robot.setBulkTank(tank);
	}

	public void takeCareOf(Cow cow) {
		if (this.robot == null) {
			throw new IllegalStateException("Milking robot has not been installed!");
		}
		this.robot.milk(cow);
	}

	public void takeCareOf(Collection<Cow> cows) {
		if (this.robot == null) {
			throw new IllegalStateException("Milking robot has not been installed!");
		}
		for (Cow n : cows) {
			this.robot.milk(n);
		}
	}

	@Override
	public String toString() {
		return this.tank.toString();
	}

}
