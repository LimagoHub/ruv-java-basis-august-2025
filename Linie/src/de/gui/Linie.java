package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Linie extends Frame {

	private static final int SIZE = 500;
	
	// Schattenfenster erstellen
	private BufferedImage image = new BufferedImage(SIZE,SIZE, BufferedImage.TYPE_INT_RGB);
	
	
	public Linie() {
		
		setSize(SIZE,SIZE);
		setResizable(false);
		addMouseListener(new MyMouseListener());
		setVisible(true);
	}
	public static void main(String[] args) {
		new Linie();

	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0,0,SIZE,SIZE, this);
	}
	
	class MyMouseListener extends MouseAdapter {

		private int x,y;
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Graphics schattenfenster = image.getGraphics();
			schattenfenster.drawLine(x, y, e.getX(), e.getY());
			schattenfenster.dispose();
			repaint();
		}
		
	}

}
