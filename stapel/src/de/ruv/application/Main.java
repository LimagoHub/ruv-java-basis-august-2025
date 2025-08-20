package de.ruv.application;

import de.geo.Punkt;
import de.ruv.collections.Stapel;
import de.ruv.tiere.Schwein;

public class Main {

	public static void main(String[] args) {
		Stapel meinStapel = new Stapel(40);
		
		for(int i = 0; i < 10; i++) {
			if(! meinStapel.isFull()) {
				meinStapel.push(new Schwein("Schwein Nr." + i));
				meinStapel.push(new Punkt(i,i));
				meinStapel.push(new Kreis(i));
			}
		}

		while( ! meinStapel.isEmpty()) {
			System.out.println(meinStapel.pop());
		}
	}

}
