package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Direction;
import game.Snake;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			if (!(Snake.head.getDir() == Direction.DOWN) && !Snake.waitToMove) {
				Snake.head.setDir(Direction.UP);
				Snake.waitToMove = true;
			}
			break;
			
		case KeyEvent.VK_DOWN:
			if (!(Snake.head.getDir() == Direction.UP) && !Snake.waitToMove) {
				Snake.head.setDir(Direction.DOWN);
				Snake.waitToMove = true;
			}
			break;
			
		case KeyEvent.VK_LEFT:
			if (!(Snake.head.getDir() == Direction.RIGHT) && !Snake.waitToMove) {
				Snake.head.setDir(Direction.LEFT);
				Snake.waitToMove = true;
			}
			break;
			
		case KeyEvent.VK_RIGHT:
			if (!(Snake.head.getDir() == Direction.LEFT) && !Snake.waitToMove) {
				Snake.head.setDir(Direction.RIGHT);
				Snake.waitToMove = true;
			}
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
