package di.setter02;

public class ServiceImpl implements MyService {
	String name;
	String msg;
	Logic logic;
	
	public ServiceImpl() {
		
	}
	
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

	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}

	
}
