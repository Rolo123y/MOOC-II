package week9.moving.domain;

public class Item implements Thing, Comparable<Thing> {

	private String name;
	private int volume;

	public Item(String name, int Volume) {
		this.volume = Volume;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(int Volume) {
		this.volume = Volume;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public String toString() {
		return this.name + " (" + this.volume + " dm^3)";
	}

	@Override
	public int compareTo(Thing thing) {

		return this.volume - thing.getVolume();
	}

}
