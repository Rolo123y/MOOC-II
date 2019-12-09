package week8;

import java.util.Scanner;

public class TextUI {

	private Participants participants;
	private Tournamet tournament;

	public TextUI() {
		this.participants = new Participants();
		this.tournament = new Tournamet();
	}

	public void run(Scanner reader) {
		System.out.println("Kumpula ski jumping week");

		System.out.println(
				"Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
		String ans = "start";
		do {
			System.out.print("Participant name: ");
			ans = reader.nextLine().trim();
			participants.addParticipant(ans);
		} while (!(ans.equals("")));

		System.out.print("\nThe tournament begins!\n");
		int round = 1;
		while (true) {
			System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
			ans = reader.nextLine().toLowerCase().trim();
			if (!(ans.equals("jump"))) {
				break;
			}
			System.out.println("\nRound " + round + "\n");
			tournament.StartRound(participants, round - 1);
			round++;
		}
		System.out.println("\nThanks!\n");
		tournament.FinalResults(participants);
	}
}
