package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 스프링의 IoC컨테이너를 이용해서 작업하기
 * - 스프링은 설정파일(xml,클래스,어노테이션)이 필요
 * - BeanFactory를 사용
 * 1. xml파싱(xml로 만들어진 설정파일을 파싱해주는 스프링에서 제공되는 객체를 이용)
 * 2. factory클래스를 생성
 * 3. factory클래스에서 제공하는 메소드를 이용해서 객체를 찾기
 * 
 */
public class MyBeanTest_spring {

	public static void main(String[] args) {
		//1. xml파싱
		Resource res = new ClassPathResource("/config/bean.xml");
		//2. 스프링이 제공하는 IoC컨테이너(객체를 생성하고 관리하는 기능을 갖고있는 클래스를) 생성
		BeanFactory factory = new XmlBeanFactory(res);
		//3. 원하는 객체를 lookup
		MyBeanStyle obj =(MyBeanStyle)factory.getBean("mybean");
		//빈을 등록할때 정의한 ID명을 매개변수로 사용 ____________^
		
		
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
