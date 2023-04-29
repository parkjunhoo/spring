package app3;

public class MyBeanStyleB implements MyBeanStyle{
	
	public MyBeanStyleB() {
		System.out.println("**********MYBEANB 생성");
	}
	public void testHello(String name) {
		System.out.println("hello,"+name);
	}
}
