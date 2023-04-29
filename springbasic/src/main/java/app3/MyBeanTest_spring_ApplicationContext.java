package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 스프링의 IoC컨테이너를 이용해서 작업하기
 * - 스프링은 설정파일(xml,클래스,어노테이션)이 필요
 * 	ApplicationContext를 생성
 * getBean 메소드를 이용해서 lookup
 */
public class MyBeanTest_spring_ApplicationContext {

	public static void main(String[] args) {
		//1. Ioc컨테이너를 생성 - ApplicationContext
		System.out.println("++++++++ApplicationContext 만들기전 ++++++++++++");
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		System.out.println("++++++++getBeam 호출전 ++++++++++++");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("mybean");
		
		//스프링의 IoC컨테이너는 객체를 싱글톤으로 관리한다.
		//						  -----
		//					동일한 id의 객체는 한 개만 만들어서 서비스한다.
		//					getBean을 호출하면 스프링컨테이너가 가지고 있는 객체를 찾아서 리턴
		
		if(obj==obj2) {
			System.out.println("같은객체");
		}else {
			System.out.println("다른객체");
		}
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("=================");
		obj.testHello("BTS");
		System.out.println("=================");
	}
	
	public static void show(MyBeanStyle obj) {
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
	}
}
