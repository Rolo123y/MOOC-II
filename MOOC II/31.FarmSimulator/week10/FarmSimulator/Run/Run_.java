package week10.FarmSimulator.Run;

import week10.FarmSimulator.Farm.*;

public class Run_ {

	public static void main(String[] args) {
		Farm farm = new Farm("Esko", new Barn(new BulkTank()));
		MilkingRobot robot = new MilkingRobot();
		farm.installMilkingRobot(robot);

		farm.addCow(new Cow());
		farm.addCow(new Cow());
		farm.addCow(new Cow());

		farm.liveHour();
		farm.liveHour();

		farm.manageCows();

		System.out.println(farm);
	}
}
