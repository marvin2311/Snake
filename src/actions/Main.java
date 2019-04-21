package actions;

import clocks.GameClock;
import gui.Gui;

public class Main {

	public static void main(String[] args) {
		Gui gui1 = new Gui();
		GameClock gc = new GameClock();
		
		gui1.create();
		gc.start();

	}

}
