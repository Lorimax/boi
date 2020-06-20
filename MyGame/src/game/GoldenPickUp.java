package game;

import java.util.concurrent.ThreadLocalRandom;

public class GoldenPickUp extends PickUp {
	
	
	@Override
	public void reset() {
		this.posX = ThreadLocalRandom.current().nextInt(0, 750);
		this.posY = ThreadLocalRandom.current().nextInt(0, 750);
	}

}
