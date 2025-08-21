package de.ruv.collections;
/**
 * 
 */
public class Stapel<T> {

	private static final int DEFAULT_SIZE = 10; 
	private int index;
	private T [] feld;
	
	public Stapel() throws StapelException {
		this(DEFAULT_SIZE);
	}
	
	public Stapel(int groesse) throws StapelException {
		try {
			index = 0;
			feld= (T []) new Object[groesse];
		} catch (Exception e) {
			throw new StapelException("Init", e);
		}
	}

	
	public void push(T value) throws StapelException{
		try {
			feld[index++] = value;
		} catch(Exception e) {
			throw new StapelException("Overflow", e);
		}
	}
	
	public T pop() throws StapelException{
		if(isEmpty())  throw new StapelException("Underflow");;
		return feld[--index];
	}
	public boolean isEmpty() {
		return index <= 0;
	}
	
	public boolean isFull() {
		return index >= feld.length;
	}
}
