package week7;

import java.util.Scanner;

public class Airport {

	private Scanner reader;
	private Flights flights;

	public Airport() {
		this.reader = new Scanner(System.in);
		this.flights = new Flights();
	}

	public void Start() {
		AirportPanelUI();
		System.out.println();
		FlightServicesUI();
		System.exit(0);
	}

	public String readString() {
		return this.reader.nextLine().trim().toLowerCase();
	}

	private void AirportPanelUI() {
		boolean isrunning = true;
		System.out.println("Airport panel\r\n" + "--------------------\r\n");
		while (isrunning == true) {
			System.out.println("Status: " + isrunning);
			System.out.println("Choose operation:\r\n" + "[1] Add airplane\r\n" + "[2] Add flight\r\n" + "[x] Exit");
			System.out.print(">");
			String option = readString();
			if (option.equals("x")) {
				isrunning = false;
				break;
			}
			HelperAirportPanel(option);
		}
	}

	private void FlightServicesUI() {
		boolean isrunning = true;
		System.out.println("Flight service\r\n" + "------------");
		while (isrunning) {
			System.out.println("Choose operation:\r\n" + "[1] Print planes\r\n" + "[2] Print flights\r\n"
					+ "[3] Print plane info\r\n" + "[x] Quit");
			System.out.print(">");
			String option = readString();
			if (option.equals("x")) {
				isrunning = false;
				break;
			}
			HelperFlightServices(option);
		}
	}

	private void HelperAirportPanel(String option) {
		if (option.equals("1")) { // add airplane
			flights.addPlane(reader);
			System.out.println();
			return;
		} else if (option.equals("2")) { // add flight
			flights.addFlight(reader);
			System.out.println();
			return;
		} else {
			System.out.println("unkown command");
			System.out.println();
			return;
		}
	}

	private void HelperFlightServices(String option) {
		if (option.equals("1")) { // print planes
			flights.printPlanes();
			return;
		} else if (option.equals("2")) { // print flights
			flights.printFlights();
		} else if (option.equals("3")) { // print plane info
			flights.printPlaneInfo(reader);
			return;
		} else {
			System.out.println("unkown command");
			return;
		}
	}
}
