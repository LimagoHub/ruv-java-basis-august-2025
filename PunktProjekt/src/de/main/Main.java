package de.main;

import de.geo.Kreis;
import de.geo.Punkt;

public class Main {

	public static void main(String[] args) {
		
		Punkt p;
		Kreis k;
		
		p = new Kreis();
		System.out.println(p);
		
		Object o = p;
		System.out.println(o);

	}

}
