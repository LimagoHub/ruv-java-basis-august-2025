package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Fenster extends Frame {

	private String message = "Hallo";
	public Fenster() {
		setSize(500,500);
		addKeyListener(new MyKeyListener());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				beenden();
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Fenster();

	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(message, 100,100);
	}
	
	private void beenden() {
		// Daten speichern
		dispose();
	}
	
	private void ausgeben() {
		message = "Taste gedrueckt";
		repaint();
	}
	
	private class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			ausgeben();
		}
	}
	
	/*private class MyWindowListener extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
		}
		
	}*/

}
