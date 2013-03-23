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

		// Instantiate and draw a triangle using an Application Context Object
		context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle");
		triangle.draw();
	}

}
