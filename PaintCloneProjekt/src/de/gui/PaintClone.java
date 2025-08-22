package de.gui;

import java.awt.Color;
import java.awt.Frame;


public class PaintClone extends Frame{

	public enum Form {Linie, Rechteck, Oval, Loeschen}
	private static final int SIZE = 500;
	
	private Color farbe = Color.WHITE;
	private Form form = Form.Linie;
	
	
	
	public Color getFarbe() {
		return farbe;
	}

	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public PaintClone() {
		setSize(SIZE,SIZE);
		setMenuBar(new MyMenubar(this));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Form f = Form.Linie;
		
		
		new PaintClone();

	}

}
