package org.koushik.javabrains;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {
	
	private Point centre;
	private double radius;

	public Point getCentre() {
		return centre;
	}

	@Autowired //First = By type; Second = By name
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
