package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

	private List<Sensor> sensors;
	private List<Integer> readings;

	public AverageSensor() {
		this.sensors = new ArrayList<Sensor>();
		this.readings = new ArrayList<Integer>();
	}

	public void addSensor(Sensor additional) {
		this.sensors.add(additional);
	}

	public List<Integer> readings() {
		return this.readings;
	}

	@Override
	public boolean isOn() {
		for (Sensor n : sensors) {
			if (n.isOn() == false) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void on() {
		for (Sensor n : sensors) {
			n.on();
		}
	}

	@Override
	public void off() {
		for (Sensor n : sensors) {
			n.off();
		}
	}

	@Override
	public int measure() {
		int sum = 0;
		for (Sensor n : sensors) {
			if (n.isOn() == true) {
				sum += n.measure();
			} else {
				throw new IllegalStateException("state is: " + n.isOn());
			}
		}
		int avg = sum / this.sensors.size();
		this.readings.add(avg);
		return avg;
	}

}
