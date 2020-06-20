package game;

import java.util.concurrent.ThreadLocalRandom;

public class PickUp {
	protected int posX;
	protected int posY;
	
	
	
	public PickUp() {
		this.posX = ThreadLocalRandom.current().nextInt(0, 750);
		this.posY = ThreadLocalRandom.current().nextInt(0, 750);
	}

	
	public void reset() {
		this.posX = ThreadLocalRandom.current().nextInt(0, 750);
		this.posY = ThreadLocalRandom.current().nextInt(0, 750);
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

