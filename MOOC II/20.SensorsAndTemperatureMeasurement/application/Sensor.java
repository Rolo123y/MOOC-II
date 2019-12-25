package application;

public interface Sensor {

	boolean isOn();

	void on();

	void off();

	int measure();

}
