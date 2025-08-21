package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;

public class Fenster extends Frame {

	private static final int SIZE = 500;
	private int x, y;
	
	public Fenster() {
		super();
		setSize(SIZE,SIZE);
		x = y = SIZE /2;
			
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawRect(x, y, 40, 40);
	}

	public static void main(String[] args) {
		new Fenster();
	}

}
