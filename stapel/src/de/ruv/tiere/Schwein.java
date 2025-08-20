package de.ruv.tiere;

public class Schwein {
	
	private String name;
	private int gewicht;
	private static int counter;
	
	
	// Klassenkonstruktor
	static {
		counter = 0;
	}
	
	
	
	public static int getCounter() {
		return counter;
	}

	//Instanzkonstruktor
	public Schwein() {
		this("Nobody");
	}
	
	public Schwein(String name) {
		setName(name);
		setGewicht(10);
		counter ++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Quiiiiekkkkk!");
		counter --;
	}
	
	public String getName() {
		return this.name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getGewicht() {
		return gewicht;
	}



	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}



	public void fuettern() {
		gewicht ++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}

	
	

}
