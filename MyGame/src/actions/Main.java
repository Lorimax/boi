package actions;

import clocks.GameClock;
import game.Game;
import gui.GUI;

public class Main {

	public static void main(String[] args) {
		
		GUI myGUI = new GUI();
		GameClock myClock = new GameClock();
		
		myGUI.create();
		
		myClock.start();

	}

}
