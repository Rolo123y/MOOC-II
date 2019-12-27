package week9.application;

public class Run_ {

	public static void main(String[] args) {
		Sensor kumpula = new Thermometer();
		Sensor kaisaniemi = new Thermometer();
		Sensor helsinkiVantaa = new Thermometer();

		AverageSensor helsinkiArea = new AverageSensor();
		helsinkiArea.addSensor(kumpula);
		helsinkiArea.addSensor(kaisaniemi);
		helsinkiArea.addSensor(helsinkiVantaa);

		helsinkiArea.on();
		System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
		System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
		System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");

		System.out.println("readings: " + helsinkiArea.readings());
	}

}
