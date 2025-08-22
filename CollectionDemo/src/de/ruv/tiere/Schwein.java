package de.ruv.tiere;

import java.util.Objects;

public class Schwein implements Comparable<Schwein>{
	
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
		this("Nobody",10);
	}
	
	public Schwein(String name, int gewicht) {
		setName(name);
		setGewicht(gewicht);
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

	@Override
	public int hashCode() {
		return Objects.hash(gewicht, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schwein other = (Schwein) obj;
		return gewicht == other.gewicht && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Schwein other) {
		
		return gewicht - other.gewicht;
	}

	
	

}
