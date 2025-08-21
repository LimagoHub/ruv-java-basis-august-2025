package de.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenster extends Frame implements KeyListener{
	
	private String message = "Hallo Fenster";
	private int counter = 0;
	
	public Fenster() {
		super("Ein tolles fenster");
		setSize(500,500);
		
		addKeyListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(message + " Counter = " + counter++, 100, 100);
		
	}

	public static void main(String[] args) {
		new Fenster();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		message = "Taste wurde gedrueckt";
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
