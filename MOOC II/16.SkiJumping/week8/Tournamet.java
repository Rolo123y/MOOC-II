package week8;

import java.util.Arrays;
import java.util.Random;

public class Tournamet {

	private Random rdm;

	public Tournamet() {
		this.rdm = new Random();
	}

	public void StartRound(Participants participants, int round) {
		int[] judgeScores = new int[5];

		System.out.println("Jumping Order:");
		participants.printReversed();
		for (Person_ n : participants.getReversed()) {
			System.out.println("\t" + n.getfName());
			int jumpLength = rdmJumpLength();
			n.addJump(jumpLength);
			System.out.println("\t\tLength: " + n.getJump(round));
			judgeScores = judgeScores(judgeScores);
			System.out.println("\t\tJudge Votes: " + Arrays.toString(judgeScores));
			n.addScore(ScoreCalculator(jumpLength, judgeScores));

		}
	}

	private int[] judgeScores(int[] judgeScores) {
		for (int i = 0; i < judgeScores.length; i++) {
			judgeScores[i] = rdm.nextInt((20 - 10) + 1) + 10;
		}
		return judgeScores;
	}

	private int rdmJumpLength() {
		return rdm.nextInt((120 - 60) + 1) + 60;
	}

	public int ScoreCalculator(int jumpLength, int[] judgeScores) {
		Arrays.sort(judgeScores);
		return jumpLength + judgeScores[1] + judgeScores[2] + judgeScores[3];
	}

	public void FinalResults(Participants participants) {
		System.out.println("Tournament Results:");
		System.out.println("Position\tName");
		participants.printFinalResults();

	}
}
