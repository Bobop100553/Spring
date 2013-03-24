package org.koushik.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static AbstractApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate and draw a Triangle using an Application Context object
		context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		System.out.println(context.getMessage("application.greeting", null, "Hello!", null));
		Shape shape1 = (Shape) context.getBean("shape1");
		shape1.draw();
		System.out.println();
		Shape shape2 = (Shape) context.getBean("shape2");
		shape2.draw();
	}

}
