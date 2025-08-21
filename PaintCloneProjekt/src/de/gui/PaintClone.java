package de.gui;

import java.awt.Frame;

public class PaintClone extends Frame{

	private static final int SIZE = 500;
	
	public PaintClone() {
		setSize(SIZE,SIZE);
		setMenuBar(new MyMenubar());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PaintClone();

	}

}
