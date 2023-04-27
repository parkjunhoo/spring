package app1;
/**
 * 
 * 결합도가 극도로 높은 프로그램
 * =>	클래스 결합도가 높고 의존성도 높다.
 * 		사용하는 클래스가 변경되면 이 클래스를 사용하는 모든 곳의 
 * 		코드를 수정해야 한다.
 *		
 *		OOP특성이 적용되지 않았다.
 *		상위인터페이스와 구현체로 분리하지 않았다.
 *		----------------------------------
 *				다형성이 적용되지 않음
 */
public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyleB obj) {
		System.out.println("=================");
		obj.testHello2("BTS");
		System.out.println("=================");
	}
	
	public static void show(MyBeanStyleB obj) {
		obj.testHello2("BTS");
		obj.testHello2("BTS");
		obj.testHello2("BTS");
		obj.testHello2("BTS");
		obj.testHello2("BTS");
	}
}
