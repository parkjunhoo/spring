package annotation.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.constructor02.AbstractPlayer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/anno.xml");
		
		MyService s =(MyService) factory.getBean("service");
		s.testService();
	}

}
