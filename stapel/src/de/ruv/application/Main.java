package de.ruv.application;

import de.ruv.collections.Stapel;

public class Main {

	public static void main(String[] args) {
		Stapel meinStapel = new Stapel();
		
		for(int i = 0; i < 10; i++) {
			if(! meinStapel.isFull()) {
				meinStapel.push(i * 10);
			}
		}

		while( ! meinStapel.isEmpty()) {
			System.out.println(meinStapel.pop());
		}
	}

}
