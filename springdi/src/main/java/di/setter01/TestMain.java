package di.setter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/setter.xml");
		
		Insa insa = (Insa) factory.getBean("insa");
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}