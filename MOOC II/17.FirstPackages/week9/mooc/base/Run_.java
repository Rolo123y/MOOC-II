package week9.mooc.base;

import week9.mooc.logic.ApplicationLogic;
import week9.mooc.ui.TextUserInterface;
import week9.mooc.ui.UserInterface;

public class Run_ {

	public static void main(String[] args) {
		UserInterface ui = new TextUserInterface();
		new ApplicationLogic(ui).execute(3);
	}
}
