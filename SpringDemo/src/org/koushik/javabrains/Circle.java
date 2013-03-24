package org.koushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component(value="shape2") // Without the optional value, creates a bean named "circle"
// Other stereotypes include @Service (for a service layer component), @Repository (for a
// Data layer component and @Controller (for a MVC controller component)
public class Circle implements Shape {
	
	private Point centre;
	private double radius;
	
	private MessageSource messageSource;

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
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println(messageSource.getMessage("circle.init.message", null, "Init of circle.", DrawingApp.getLocale()));
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println(messageSource.getMessage("circle.destroy.message", null, "Destroy of circle.", DrawingApp.getLocale()));
	}

	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("circle.drawn.message", null, "Hello from the circle class!", DrawingApp.getLocale()));
		System.out.println(messageSource.getMessage("circle.centre.message", new Object[] {centre.displayPoint()}, "?", DrawingApp.getLocale())); 
		System.out.println(messageSource.getMessage("circle.radius.message", new Object[] {radius}, "?", DrawingApp.getLocale()));

	}

}
