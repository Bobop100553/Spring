package org.koushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="shape2") // Without the optional value, creates a bean named "circle"
// Other stereotypes include @Service (for a service layer component), @Repository (for a
// Data layer component and @Controller (for a MVC controller component)
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

	@Value(value="3.75")
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle.");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle.");
	}

	@Override
	public void draw() {
		System.out.println("Circle drawn.");
		System.out.println("Centre = (" + centre.getX() +", " + centre.getY() + ")");
		System.out.println("Radius = " + radius);

	}

}
