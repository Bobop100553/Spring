package org.koushik.javabrains;

import javax.annotation.Resource;

public class Circle implements Shape {
	
	private Point centre;
	private double radius;

	public Point getCentre() {
		return centre;
	}

	@Resource(name="pointC") // If name is not specified, looks for a bean with the same
							 // name as the member variable
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
