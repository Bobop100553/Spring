package org.koushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

public class Triangle implements Shape, ApplicationEventPublisherAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	@PostConstruct
	public void initializeTriangle() {
		System.out.println(messageSource.getMessage("triangle.init.message", null, "Init of triangle.", null));
	}
	
	@PreDestroy
	public void destroyTriangle() {
		System.out.println(messageSource.getMessage("triangle.destroy.message", null, "Destroy of triangle.", null));
	}

	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("triangle.drawn.message", null, "Hello from the triangle class!", null));
		System.out.println(messageSource.getMessage("triangle.point.message", new Object[] {pointA.displayPoint()}, "Point = ?", null));
		System.out.println(messageSource.getMessage("triangle.point.message", new Object[] {pointB.displayPoint()}, "Point = ?", null));
		System.out.println(messageSource.getMessage("triangle.point.message", new Object[] {pointC.displayPoint()}, "Point = ?", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

}
