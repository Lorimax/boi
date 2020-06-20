package actions;

import game.*;
import java.awt.event.*;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent event) {
		
		switch(event.getKeyCode()) {
		case KeyEvent.VK_UP:
			Game.myBoi.setBoiDirectoin(Direction.UP);
			break;
		case KeyEvent.VK_RIGHT:
			Game.myBoi.setBoiDirectoin(Direction.RIGHT);
			break;
		case KeyEvent.VK_DOWN:
			Game.myBoi.setBoiDirectoin(Direction.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			Game.myBoi.setBoiDirectoin(Direction.LEFT);
			break;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
