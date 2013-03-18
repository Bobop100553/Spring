package org.koushik.javabrains;

public class Circle implements Shape {
	
	private Point centre;
	private double radius;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle drawn.");
		System.out.println("Centre = (" + centre.getX() +", " + centre.getY() + ")");
		System.out.println("Radius = " + radius);

	}

}
