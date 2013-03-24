package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static ApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate and draw a Triangle using an Application Context object
		context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle1");
		triangle.draw();
	}

}
