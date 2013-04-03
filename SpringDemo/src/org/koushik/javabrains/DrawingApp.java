package org.koushik.javabrains;

import java.util.Locale;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static Locale locale;
	
	public static Locale getLocale() {
		return locale;
	}

	public static void setLocale(Locale locale) {
		DrawingApp.locale = locale;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		locale = Locale.GERMANY;
		
		// Instantiate and draw a Triangle using an Application Context object
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		System.out.println(context.getMessage("application.greeting", null, "Hello!", locale));
		Shape shape1 = (Shape) context.getBean("shape1");
		shape1.draw();
		System.out.println();
		Shape shape2 = (Shape) context.getBean("shape2");
		shape2.draw();
		context.close();
	}

}
