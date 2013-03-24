package org.koushik.javabrains;

public class Point {
	
	// Horizontal (x) coordinate of the point
	// Vertical (y) coordinate of the point
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String displayPoint() {
		return "(" + x + ", " + y + ")";
	}
	
}
