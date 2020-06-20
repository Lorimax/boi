package gui;

import java.awt.event.*;

import javax.swing.*;

import actions.KeyHandler;
import clocks.GameClock;
import game.Game;

public class GUI {

	private JFrame myJF;
	
	private static final int windowWidth = 1000;
	private static final int windowHeight = 1000;
	
	public void create() {
		myJF = new JFrame("My Game");
		myJF.setSize(windowWidth, windowHeight );
		myJF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myJF.setLocationRelativeTo(null);
		myJF.setLayout(null);
		myJF.setResizable(false);
		
	
		  
		myJF.requestFocus();
		myJF.setVisible(true);
		  
		 
		 
		myJF.addKeyListener(new KeyHandler());
		
			
			
		
			Draw myDraw = new Draw();
			myDraw.setBounds(0,0, windowWidth, windowHeight);
			myDraw.setVisible(true);
		
			myJF.add(myDraw);
	}
	
	public static int getWindowwidth() {
		return windowWidth;
	}

	public static int getWindowheight() {
		return windowHeight;
	}

}
