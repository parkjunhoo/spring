package di.constructor01;

public class ServiceImpl implements MyService {
	String name;
	String msg;
	Logic logic;
	
	public ServiceImpl(String name,String msg,Logic logic) {
		this.name = name;
		this.msg = msg;
		this.logic = logic;
	}
	
	@Override
	public void testService() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}

	
}
