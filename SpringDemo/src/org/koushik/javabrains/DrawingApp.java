package org.koushik.javabrains;

// import org.springframework.beans.factory.BeanFactory;
// import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	private static ApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate and draw a Triangle without using Spring
		// Triangle triangle = new Triangle();
		// triangle.draw();
		
		// Instantiate and draw a Triangle using a Spring Bean Factory object
		/* BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		   Triangle triangle = (Triangle) factory.getBean("Triangle");
		   triangle.draw(); */
		
		context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle");
		triangle.draw();
	}

}
