package game;

import gui.GUI;

import java.awt.*;
import java.util.*;
import java.math.*;
import actions.Colissions;

public class Game {
	
	public static boolean runGame = false;
	
	public static Boi myBoi = new Boi(GUI.getWindowwidth()/2, GUI.getWindowheight()/2) ;
	private static double boiSpeed = 2.2;
	
	public static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	public static PickUp pickup = new PickUp();
	
	public static ArrayList<GoldenPickUp> goldenPickUps = new ArrayList<GoldenPickUp>();
	
	public static int score = 0;
	public static int bestScore = 0;
	public static boolean scoredInLevel = false;
	
	public static int level = 1;
	
	public static void move() {
		
		//move Boi
		switch(myBoi.getBoiDirectoin()) {
		case RIGHT:
			if(myBoi.getPosX() < 965) {
				myBoi.moveX(boiSpeed);
			}
			break;
		case UP:
			if(myBoi.getPosY() > 1) {
				myBoi.moveY(-boiSpeed);
			}
			break;
		case LEFT:
			if(myBoi.getPosX() > 1) {
				myBoi.moveX(-boiSpeed);
			}
			break;
		case DOWN:
			if(myBoi.getPosY() < 940) {
				myBoi.moveY(boiSpeed);
			}
			break;
		}
		
		
		//move enemies
		if(enemies.size() > 0) {
			int posDiffX;
			int posDiffY;
			
			boolean moveable = true;
			
			for(int i = 0; i < enemies.size(); i++) {
				
				//prohibit stacking of enemies
				if(enemies.size() > 1) {
					int j = i + 1;
					while(moveable && j < enemies.size()) {
						posDiffX = enemies.get(i).getPosX() - enemies.get(j).getPosX();
						posDiffY = enemies.get(i).getPosY() - enemies.get(j).getPosY();
						
						posDiffX = (posDiffX < 0 ? -posDiffX : posDiffX);
						posDiffY = (posDiffY < 0 ? -posDiffY : posDiffY);
						
						if(posDiffX <= 25 && posDiffY <= 25) {
							moveable = false;
						}
						j++;
					}
				}
				
				if(enemies.get(i).getPosX() > myBoi.getPosX() && moveable) {
					enemies.get(i).setPosX(enemies.get(i).getPosX() - 1);
					}
				else if(enemies.get(i).getPosX() < myBoi.getPosX() && moveable) {
					enemies.get(i).setPosX(enemies.get(i).getPosX() + 1);
				}
		
				if(enemies.get(i).getPosY() > myBoi.getPosY() && moveable) {
					enemies.get(i).setPosY(enemies.get(i).getPosY() -1);
				}
				else if(enemies.get(i).getPosY() < myBoi.getPosY() && moveable) {
					enemies.get(i).setPosY(enemies.get(i).getPosY() + 1);
				}
		
				posDiffX = myBoi.getPosX() - enemies.get(i).getPosX();
				posDiffY = myBoi.getPosY() - enemies.get(i).getPosY();
				
				posDiffX = (posDiffX < 0 ? -posDiffX : posDiffX);
				posDiffY = (posDiffY < 0 ? -posDiffY : posDiffY);
				
				
				
				moveable = true;
			}
		}
		
	}
	
	public static void addEnemy() {
		for(int i = 0; i < level; i++) {
			Enemy newEnemy = new Enemy();
			enemies.add(newEnemy);
		}
	}
	
	public static void throwGoldenPickUp() {
		goldenPickUps.add(new GoldenPickUp());
	}
	
	public static void goldenPickUpCatched(int index) {
		level++;
		scoredInLevel = false;
		goldenPickUps.remove(index);
	}
	
	public static void reset() {
		score = 0;
		level = 1;
		enemies.clear();
		scoredInLevel = false;
		goldenPickUps.clear();
		myBoi.setBoiDirectoin(Direction.STAND);
		addEnemy();
	}
}
