package de.ruv.collections;
/**
 * 
 */
public class Stapel {

	private static final int DEFAULT_SIZE = 10; 
	private int index;
	private int [] feld;
	
	public Stapel() {
		this(DEFAULT_SIZE);
	}
	
	public Stapel(int groesse) {
		index = 0;
		feld= new int[groesse<1?DEFAULT_SIZE:groesse];
	}

	
	public void push(int value) {
		if(isFull()) return;
		feld[index++] = value;
	}
	
	public int pop() {
		if(isEmpty()) return 0;
		return feld[--index];
	}
	public boolean isEmpty() {
		return index <= 0;
	}
	
	public boolean isFull() {
		return index >= feld.length;
	}
}
