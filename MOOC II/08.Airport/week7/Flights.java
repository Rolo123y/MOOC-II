package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Flights {

	//private HashMap<Plane, Object[]> fl;
	private HashMap<Plane, ArrayList<String>> flights;
	private ArrayList<Plane> planes;

	public Flights() {
		this.flights = new HashMap<Plane, ArrayList<String>>();
		this.planes = new ArrayList<Plane>();
	}

	public void addPlane(Scanner reader) {
		ArrayList<String> flightsForPlane = new ArrayList<>();
		System.out.print("Give plane ID: ");
		String ID = reader.nextLine().toUpperCase().trim();
		System.out.print("Give plane capacity: ");
		int capacity = reader.nextInt();
		Plane plane = new Plane(ID, capacity);
		planes.add(plane);
		flightsForPlane.add(null);
		flightsForPlane.add(null);
		flights.put(plane, flightsForPlane);
	}

	public void addFlight(Scanner reader) {
		ArrayList<String> flightsForPlane = new ArrayList<>();
		System.out.print("Give plane ID: ");
		String ID = reader.nextLine().toUpperCase().trim();
		for (Plane n : planes) {
			if (n.getID().equals(ID)) {
				System.out.print("Give departure airport code: ");
				String dep = reader.nextLine().toUpperCase().trim();
				System.out.print("Give destination airport code: ");
				String dest = reader.nextLine().toUpperCase().trim();
				flightsForPlane.add(dep);
				flightsForPlane.add(dest);
				flights.put(n, flightsForPlane);
				return;
			}
		}
		System.out.println("Plane does not exist!");
	}

	public void printPlanes() {
		for (Plane n : planes) {
			System.out.println(n);
		}
	}

	public void printFlights() {
		if (!flights.isEmpty()) {
			for (Plane n : flights.keySet()) {
				System.out.println(n.toString() + " (" + flights.get(n).get(0) + "-" + flights.get(n).get(1) + ")");
			}
		} else {
			System.out.println("no flights!");
		}
	}

	public void printPlaneInfo(Scanner reader) {
		System.out.print("Give plane ID: ");
		String ID = reader.nextLine().toUpperCase().trim();
		for (Plane n : planes) {
			if (n.getID().equals(ID)) {
				System.out.println(n);
			}
		}
	}

}
