package de.gui;

import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static de.gui.PaintClone.Form;

public class MyMenubar extends MenuBar {
	
	public MyMenubar(PaintClone paintclone) {
		Menu menu;
		MenuItem menuItem;
		
		menu = new Menu("Datei");
		
		menuItem = new MenuItem("Beenden");
		
		/*menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintclone.dispose();
				
			}
		});*/
		
		menuItem.addActionListener(e->paintclone.dispose());
		
		menu.add(menuItem);
		
		add(menu);
		
		menu = new Menu("Formen");
		
		menuItem = new MenuItem(Form.Linie.name());
		menuItem.addActionListener(e->paintclone.setForm(Form.Linie));
		menu.add(menuItem);
		
		menuItem = new MenuItem("Rechteck");
		menuItem.addActionListener(e->paintclone.setForm(Form.Rechteck));
		menu.add(menuItem);
		
		menuItem = new MenuItem("Oval");
		menuItem.addActionListener(e->paintclone.setForm(Form.Oval));
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new MenuItem("Loeschen");
		menuItem.addActionListener(e->paintclone.setForm(Form.Loeschen));
		menu.add(menuItem);
		
		add(menu);
		
		menu = new Menu("Farben");
		
		menuItem = new MenuItem("Weiss");
		menuItem.addActionListener(e->paintclone.setFarbe(Color.WHITE));
		menu.add(menuItem);
		
		menuItem = new MenuItem("Rot");
		menuItem.addActionListener(e->paintclone.setFarbe(Color.RED));
		menu.add(menuItem);
		
		menuItem = new MenuItem("Blau");
		menuItem.addActionListener(e->paintclone.setFarbe(Color.BLUE));
		menu.add(menuItem);
		
		menuItem = new MenuItem("Gelb");
		menuItem.addActionListener(e->paintclone.setFarbe(Color.YELLOW));
		menu.add(menuItem);
		
		menuItem = new MenuItem("Gruen");
		menuItem.addActionListener(e->paintclone.setFarbe(Color.GREEN));
		menu.add(menuItem);
		
		menuItem = new MenuItem("Pink");
		menuItem.addActionListener(e->paintclone.setFarbe(Color.PINK));
		menu.add(menuItem);
		
		add(menu);
	}

}
