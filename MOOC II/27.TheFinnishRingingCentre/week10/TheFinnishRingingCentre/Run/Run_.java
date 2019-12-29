package week10.TheFinnishRingingCentre.Run;

import week10.TheFinnishRingingCentre.Bird;
import week10.TheFinnishRingingCentre.RingingCentre;

public class Run_ {

	public static void main(String[] args) {

		RingingCentre kumpulaCentre = new RingingCentre();

		kumpulaCentre.observe(new Bird("Rose Starling", "Sturnus roseus", 2012), "Arabia");
		kumpulaCentre.observe(new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012), "Vallila");
		kumpulaCentre.observe(new Bird("European Herring Gull", "Larus argentatus", 2008), "Kumpulanmäki");
		kumpulaCentre.observe(new Bird("Rose Starling", "Sturnus roseus", 2008), "Mannerheimintie");

		kumpulaCentre.observations(new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012));
		System.out.println("--");
		kumpulaCentre.observations(new Bird("European Herring Gull", "Larus argentatus", 2008));
		System.out.println("--");
		kumpulaCentre.observations(new Bird("European Herring Gull", "Larus argentatus", 1980));
	}

}
