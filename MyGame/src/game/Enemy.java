package game;

import java.util.concurrent.ThreadLocalRandom;

public class Enemy {
	private int posX;
	private int posY;
	
	
	public Enemy() {
		int startSide = ThreadLocalRandom.current().nextInt(0,3);
		
		switch(startSide) {
		case 0:
			posX = ThreadLocalRandom.current().nextInt(0, 1000);
			posY = 0;
			break;
		case 1:
			posX = 1000;
			posY = ThreadLocalRandom.current().nextInt(0, 1000);
			break;
		case 2:
			posX = ThreadLocalRandom.current().nextInt(0, 1000);
			posY = 1000;
			break;
		case 3:
			posX = 0;
			posY = ThreadLocalRandom.current().nextInt(0, 1000);
		}
		
	}

	public void reset() {
		this.posX = ThreadLocalRandom.current().nextInt(0, 1000);
		this.posY = ThreadLocalRandom.current().nextInt(0, 1000);
	}

	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	

}
