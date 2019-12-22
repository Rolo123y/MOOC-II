package week9.mooc.logic;

import week9.mooc.ui.UserInterface;

public class ApplicationLogic {

	private UserInterface ui;

	public ApplicationLogic(UserInterface ui) {
		this.ui = ui;
	}

	public void execute(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.println("The application logic works");
			ui.update();
		}
	}

}
