package application;

import java.util.Random;

public class Thermometer implements Sensor {

	private boolean Status;

	public Thermometer() {
		this.Status = false;
	}

	@Override
	public boolean isOn() {
		if (Status == true) {
			return true;
		}
		return false;
	}

	@Override
	public void on() {
		this.Status = true;
	}

	@Override
	public void off() {
		this.Status = false;
	}

	@Override
	public int measure() {
		if (Status == true) {
			Random rdm = new Random();
			int num = rdm.nextInt((30 - (-30)) + 1) + (-30);
			return num;
		} else {
			throw new IllegalStateException("State is: " + this.Status);
		}
	}

}
