package de.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Fenster extends Frame{
	
	public Fenster() {
		super("Ein tolles fenster");
		setSize(500,500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("Hallo Fenster", 100, 100);
		g.setColor(Color.PINK);
		g.drawLine(100, 100, 200, 200);
	}

	public static void main(String[] args) {
		new Fenster();

	}

}
