package gui;

import java.awt.*;

import javax.swing.*;

import clocks.GameClock;
import game.Game;


public class Draw extends JLabel {
	
	Point pt;
	Menu myMenu = new Menu();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		//draw Background
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, GUI.getWindowwidth(), GUI.getWindowheight());
		
		
		//draw PickUp
		g.setColor(Color.GREEN);
		g.fillRect(Game.pickup.getPosX(), Game.pickup.getPosY(), 30, 30);
		
		//draw golden Pickup
		if (Game.goldenPickUps.size() > 0) {
			for(int i = 0; i < Game.goldenPickUps.size(); i++) {
					g.setColor(Color.YELLOW);
					g.fillRect(Game.goldenPickUps.get(i).getPosX(), Game.goldenPickUps.get(i).getPosY(), 30, 30);
			}
			}
			
		//draw Boi
		g.setColor(Color.RED);
		g.fillOval(Game.myBoi.getPosX(), Game.myBoi.getPosY() , 30, 30);
		
		//Draw Enemy
		g.setColor(Color.BLACK);
		for(int i = 0; i < Game.enemies.size(); i++) {
			g.fillOval(Game.enemies.get(i).getPosX(), Game.enemies.get(i).getPosY(), 30, 30);
		}
		
		//Draw score
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Score: " + Game.score, 5, 25);
		g.drawString("Best Score " + Game.bestScore, 755, 25);
		
		
		//Draw time
		g.drawString("Level: " + Game.level, 365, 25);
		
		repaint();
		
	}

}
