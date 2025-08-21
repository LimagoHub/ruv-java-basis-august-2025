package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;

public class Fenster extends Frame implements KeyListener, MouseMotionListener, WindowListener{

	private static final int SIZE = 800;
	private int x, y;
	
	public Fenster() {
		super();
		setSize(SIZE,SIZE);
		x = y = SIZE /2;
		addMouseMotionListener(this);	
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawRect(x, y, 40, 40);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x += (e.getX()-x)/20;
		y += (e.getY()-y)/20;
		repaint();
	}

}
