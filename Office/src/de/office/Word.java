package de.office;

public class Word extends WordPad implements Dokument {
	
	@Override
	public void drucken() {
		System.out.println("Hier druckt Word");
	}

}
