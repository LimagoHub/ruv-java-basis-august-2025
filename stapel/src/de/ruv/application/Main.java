package de.ruv.application;

import de.geo.Kreis;
import de.geo.Punkt;
import de.ruv.collections.Stapel;
import de.ruv.collections.StapelException;
import de.ruv.tiere.Schwein;

public class Main {

	public static void main(String[] args) {
		try {
			Stapel<Punkt> meinStapel = new Stapel<>(-40);
			
			for(int i = 0; i < 10; i++) {
				if(! meinStapel.isFull()) {
					//meinStapel.push(new Schwein("Schwein Nr." + i));
					meinStapel.push(new Punkt(i,i));
					meinStapel.push(new Kreis(i));
					//meinStapel.push(i);
				}
			}

			while( ! meinStapel.isEmpty()) {
				Punkt p =  meinStapel.pop();
				p.rechts();
				System.out.println(p);
			}
		} catch (StapelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
