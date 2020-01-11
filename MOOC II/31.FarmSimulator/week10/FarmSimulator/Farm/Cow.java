package week10.FarmSimulator.Farm;

import java.util.Random;

public class Cow implements Milkable, Alive {

	private String name;
	private int milkCapacity;
	private double volumeOfMilk;
	private Random rdm = new Random();
	private static final String[] NAMES = new String[] { "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke",
			"Hilsu", "Hymy", "Ihq", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki", "Mainikki", "Mella",
			"Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu",
			"Virpi" };

	public Cow() {
		this.milkCapacity = rdm.nextInt(26) + 15;
		this.name = NAMES[rdm.nextInt(NAMES.length)];
		this.volumeOfMilk = 0;
	}

	public Cow(String name) {
		this.name = name;
		this.milkCapacity = rdm.nextInt(26) + 15;
		this.volumeOfMilk = 0;
	}

	public String getName() {
		return this.name;
	}

	public double getCapacity() {
		return this.milkCapacity;
	}

	public double getAmount() {
		return this.volumeOfMilk;
	}

	@Override
	public void liveHour() {
		this.volumeOfMilk += (rdm.nextInt(20 - 7 + 1) + 7) / 10.0;
		if (this.volumeOfMilk > this.milkCapacity) {
			this.volumeOfMilk = this.milkCapacity;
		}
	}

	@Override
	public double milk() {
		double amountOfMilkReleased = this.volumeOfMilk;
		this.volumeOfMilk = 0;
		return amountOfMilkReleased;
	}

	@Override
	public String toString() {
		return this.getName() + " " + Math.round(this.getAmount() * 100) / 100.0 + "/" + this.getCapacity();
	}

}
