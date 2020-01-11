package week10.FarmSimulator.Farm;

public class MilkingRobot {

	private BulkTank tank;

	public MilkingRobot() {
		this.tank = null;
	}

	public BulkTank getBulkTank() {
		return this.tank;
	}

	public void setBulkTank(BulkTank tank) {
		this.tank = tank;
	}

	public void milk(Milkable milkable) {
		if (this.tank == null) {
			throw new IllegalStateException("no tank has been fixed");
		} else {
			this.tank.addToTank(milkable.milk());
		}
	}

}
