package de.ruv.collections;
/**
 * 
 */
public class Stapel<T> {

	private static final int DEFAULT_SIZE = 10; 
	private int index;
	private T [] feld;
	
	public Stapel() {
		this(DEFAULT_SIZE);
	}
	
	public Stapel(int groesse) {
		index = 0;
		feld= (T []) new Object[groesse<1?DEFAULT_SIZE:groesse];
	}

	
	public void push(T value) {
		if(isFull()) return;
		feld[index++] = value;
	}
	
	public T pop() {
		if(isEmpty()) return null;
		return feld[--index];
	}
	public boolean isEmpty() {
		return index <= 0;
	}
	
	public boolean isFull() {
		return index >= feld.length;
	}
}
