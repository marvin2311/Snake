package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import game.Snake;

public class Draw extends JLabel{
	
	Point p;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		// Background
		g.setColor(new Color(126, 223, 254));
		g.fillRect(0, 0, Gui.width, Gui.height);
		
		// Tails
		g.setColor(Color.GREEN);
		for (int i = 0; i < Snake.tails.size(); i++) {
			p = Snake.ptc( Snake.tails.get(i).getX(), Snake.tails.get(i).getY() );
			g.fillRect(p.x, p.y, 32, 32);
		}
		
		// Head
		g.setColor(new Color(77, 169, 55));
		p = Snake.ptc( Snake.head.getX(), Snake.head.getY() );
		g.fillRect(p.x, p.y, 32, 32);
		
		//Pickup
		g.setColor(Color.RED);
		p = Snake.ptc( Snake.pU.getX(), Snake.pU.getY() );
		g.fillRect(p.x, p.y, 32, 32);
		
		
		// Field
		g.setColor(Color.GRAY);
		g.drawRect(Gui.xoff, Gui.yoff, 512, 512);
		
		for (int i = 0; i<16; i++) {
			for (int j = 0; j < 16; j++) {
				g.drawRect(i*32 +Gui.xoff, j*32 +Gui.yoff, 32, 32);
			}
		}
		
		// Score
		g.setColor(Color.BLACK);
		g.drawString("Score: "+Snake.score, 5, 25);
		g.drawString("Best: "+Snake.bestscore, 5, 45);
		
		repaint();
		
	}
}
