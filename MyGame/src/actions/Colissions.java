package actions;

import game.Direction;
import game.Game;

public class Colissions {
	
	public static boolean collisionPickUp() {
		int posDiffX = Game.myBoi.getPosX() - Game.pickup.getPosX();
		int posDiffY = Game.myBoi.getPosY() - Game.pickup.getPosY();
		
		posDiffX = (posDiffX < 0 ? -posDiffX : posDiffX);
		posDiffY = (posDiffY < 0 ? -posDiffY : posDiffY);
		
		if(posDiffX <= 25 && posDiffY <= 25 ) {
			return true;
		}
		
		return false;
	}
	
	public static int collisionGoldenPickUp() {
		if (Game.goldenPickUps.size() >= 1) {
			int posDiffX = 0;
			int posDiffY = 0;
			
			for(int index = 0; index < Game.goldenPickUps.size(); index++) {
					posDiffX = Game.myBoi.getPosX() - Game.goldenPickUps.get(index).getPosX();
					posDiffY = Game.myBoi.getPosY() - Game.goldenPickUps.get(index).getPosY();

					posDiffX = (posDiffX < 0 ? -posDiffX : posDiffX);
					posDiffY = (posDiffY < 0 ? -posDiffY : posDiffY);

					if (posDiffX <= 25 && posDiffY <= 25) {
						return index;
					}
		}
		}
		return -1;
	}
		
	public static boolean collisionEnemy() {
		if (Game.enemies.size() > 0) {
			for (int i = 0; i < Game.enemies.size(); i++) {
				int posDiffX = Game.myBoi.getPosX() - Game.enemies.get(i).getPosX();
				int posDiffY = Game.myBoi.getPosY() - Game.enemies.get(i).getPosY();

				posDiffX = (posDiffX < 0 ? -posDiffX : posDiffX);
				posDiffY = (posDiffY < 0 ? -posDiffY : posDiffY);

				//check if boi is catched
				if (posDiffX <= 15 && posDiffY <= 15) {
					return true;
				}
			} 
		}
		
		return false;
	}
	
}
