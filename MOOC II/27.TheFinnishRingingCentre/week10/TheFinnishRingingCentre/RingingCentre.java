package week10.TheFinnishRingingCentre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

	private List<String> places;
	private Map<Bird, List<String>> observedBirds;

	public RingingCentre() {
		this.observedBirds = new HashMap<Bird, List<String>>();
	}

	public void observe(Bird bird, String place) {
		if (this.observedBirds.containsKey(bird)) {
			observedBirds.get(bird).add(place);
		} else {
			places = new ArrayList<String>();
			places.add(place);
			observedBirds.put(bird, places);
		}
	}

	public void observations(Bird bird) {
		if (observedBirds.get(bird) == null) {
			System.out.println(bird + " observations: 0");
		} else {
			System.out.println(bird + " observations: " + observedBirds.get(bird).size());
			printPlaces(observedBirds.get(bird));
		}
	}

	private void printPlaces(List<String> places) {
		for (String n : places) {
			System.out.println(n);
		}
	}

}
