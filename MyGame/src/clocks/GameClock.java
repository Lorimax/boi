package clocks;



import java.util.concurrent.ThreadLocalRandom;

import actions.Colissions;
import game.*;

public class GameClock extends Thread {
	
	public static boolean running = true;
	public static long cycle = 0;
	public static long timeForGoldenPickUp = ThreadLocalRandom.current().nextLong(2000, 3000);
	
	public void run() {
			Game.addEnemy();
			while (running) {
				try {
					sleep(5);
					Game.move();
					if (Colissions.collisionPickUp()) {
						Game.pickup.reset();
						Game.score += Game.level * 2;
						Game.scoredInLevel = true;
						if (Game.score > Game.bestScore) {
							Game.bestScore = Game.score;
						}
						Game.addEnemy();
					}
					if (Colissions.collisionEnemy()) {
						cycle = 0;
						Game.reset();
					}
					int index  = Colissions.collisionGoldenPickUp();
					if (index != -1) {
						cycle = 0;
						Game.goldenPickUpCatched(index);
					}
					if (cycle >= timeForGoldenPickUp && Game.scoredInLevel) {
						Game.throwGoldenPickUp();
						timeForGoldenPickUp = ThreadLocalRandom.current().nextLong(2000, 3000);
						cycle = 0;
					} else if (cycle >= timeForGoldenPickUp && !Game.scoredInLevel) {
						cycle = 0;
					}
					
					cycle++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}