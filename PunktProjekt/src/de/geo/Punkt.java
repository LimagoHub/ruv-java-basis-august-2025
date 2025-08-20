package de.geo;

public class Punkt extends Object{
	private double x,y;

	public Punkt() {
		this(0,0);
	}
	public Punkt(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	private void setX(double x) {
		if(x > 10.0) x = 10.0;
		if(x < -10) x = -10.0;
		this.x = x;
	}
	public double getY() {
		return y;
	}
	private void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
	}
	
	public void rechts() {
		setX(getX() + 1);
	}
	
	
}
